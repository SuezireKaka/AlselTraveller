package www.alsel.traveller.bot.listener;

import java.util.Arrays;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.GuildMessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import www.alsel.traveller.bot.ResponseCarrier;
import www.alsel.traveller.bot.command.api.WebClientRequestStrategy;
import www.alsel.traveller.bot.controller.CommandController;
import www.alsel.traveller.bot.controller.args.ArgsPacker;
import www.alsel.traveller.bot.controller.args.ArgsSaver;
import www.alsel.traveller.bot.view.View;

@Slf4j
@RequiredArgsConstructor
public class MessageListener extends ListenerAdapter {
	@NonNull
	private String makerID;

	private CommandController controller = new CommandController();

	private ResponseCarrier carrier = new ResponseCarrier();
	
	private WebClientRequestStrategy requester = new WebClientRequestStrategy();

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		User user = event.getAuthor();
		requester.save(user);
		
		GuildMessageChannel msgChannel = (GuildMessageChannel) event.getChannel();

		Message message = event.getMessage();

		log.info("get message : " + message.getContentDisplay());

		if (user.isBot()) {
			return;
		} else if (message.getContentDisplay().equals("")) {
			log.info("디스코드 Message 문자열 값 공백");
		}

		String[] messageArray = ArgsSaver.hasSaved(user)
				? ArgsSaver.getCommandKeyOf(user).split(ArgsPacker.SEPERATOR)
				: message.getContentDisplay().split(ArgsPacker.SEPERATOR);
		
		String commandKey = messageArray[0];
		String[] commandArgs = Arrays.copyOfRange(messageArray, 1, messageArray.length);
		
		String asyncMessage = message.getContentDisplay();

		try {
			View resultView = controller.execute(
					user, msgChannel,
					commandKey, commandArgs, asyncMessage,
					requester);

			if (resultView != null) {
				carrier.carryResponseToChannel(msgChannel, resultView, makerID);
			}
		} catch (Exception e) {
			e.printStackTrace();
			carrier.carryErrorToChannel(msgChannel, e, makerID);
		}

	}

}