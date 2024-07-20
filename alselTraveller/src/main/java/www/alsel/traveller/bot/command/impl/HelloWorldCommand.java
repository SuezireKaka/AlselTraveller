package www.alsel.traveller.bot.command.impl;

import java.util.Map;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.GuildMessageChannel;
import www.alsel.traveller.bot.command.Command;
import www.alsel.traveller.bot.controller.args.ArgsPacker;
import www.alsel.traveller.bot.exception.ArgsNumberDismatchException;
import www.alsel.traveller.bot.model.data.SimpleMessageVO;
import www.alsel.traveller.bot.parser.DiscordContents;
import www.alsel.traveller.bot.parser.impl.SimpleMessageParser;
import www.alsel.traveller.bot.view.View;
import www.alsel.traveller.bot.view.impl.CommandResultView;

public class HelloWorldCommand implements Command {
	public static final String COMMAND = Command.PREFIX + "hello";
	public static final String EXPLAIN = "봇이 헬로월드를 시전해요";
	
	private static final String[] ARGS_NAME_ARRAY = new String[]{};
	
	public static final String USAGE = ArgsPacker.usagePack(COMMAND, ARGS_NAME_ARRAY);
	
	@Override
	public String[] getArgsNameArray() {
		return ARGS_NAME_ARRAY.clone();
	}
	
	@Override
	public View command(User user, GuildMessageChannel channel,
			Map<String, String> argsMap) throws Exception {
		if (argsMap.size() != ARGS_NAME_ARRAY.length) {
			throw new ArgsNumberDismatchException(
					argsMap.values().toArray(new String[0]),
					ARGS_NAME_ARRAY);
		}
		
		SimpleMessageVO result = new SimpleMessageVO("Hello, world!");
		
		DiscordContents contents = new DiscordContents(new SimpleMessageParser(result));
	   	
		contents.parse();
		
	   	return CommandResultView.builder()
	   			.title(USAGE)
	   			.contents(contents)
	   			.build();
	}
}
