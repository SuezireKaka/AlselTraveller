package www.alsel.traveller.bot.controller;

import java.util.Map;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.GuildMessageChannel;
import www.alsel.traveller.bot.command.Command;
import www.alsel.traveller.bot.command.api.WebClientRequestStrategy;
import www.alsel.traveller.bot.command.impl.HelloWorldCommand;
import www.alsel.traveller.bot.command.impl.ListAllCommand;
import www.alsel.traveller.bot.controller.args.ArgsPacker;
import www.alsel.traveller.bot.exception.NoCommandFoundException;
import www.alsel.traveller.bot.view.View;

public class CommandController {
	
	public View execute(User user, GuildMessageChannel channel,
			String key, String[] args, String asyncMessage,
			WebClientRequestStrategy requester) throws Exception {
		Map<String, String> packedArgs;
		
		View result = null;
		
		if (key.equalsIgnoreCase(HelloWorldCommand.COMMAND)
				&& args.length == new HelloWorldCommand().getArgsNameArray().length) {
			
            packedArgs = new ArgsPacker<HelloWorldCommand>()
            		.mapPack(new HelloWorldCommand(), args);
            
            result = new HelloWorldCommand().command(user, channel, packedArgs);
            result.init(HelloWorldCommand.class);
        }
		
		else if (key.equalsIgnoreCase(ListAllCommand.COMMAND)
        		&& args.length == new ListAllCommand().getArgsNameArray().length) {
			
        	packedArgs = new ArgsPacker<ListAllCommand>()
                	.mapPack(new ListAllCommand(), args);

        	result = new ListAllCommand().command(user, channel, packedArgs);
        	result.init(ListAllCommand.class);
        }
		
		
		
		else if (key.startsWith(Command.PREFIX) && ! key.equals(Command.PREFIX)) {
			throw new NoCommandFoundException(key, args);
		}
		
		return result;
	}
}
