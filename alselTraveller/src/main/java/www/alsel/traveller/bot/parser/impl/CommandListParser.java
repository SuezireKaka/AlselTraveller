package www.alsel.traveller.bot.parser.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import www.alsel.traveller.bot.model.data.CommandVO;
import www.alsel.traveller.bot.model.structure.Pair;
import www.alsel.traveller.bot.parser.DiscordParser;

@AllArgsConstructor
public class CommandListParser extends DiscordParser {
	private List<CommandVO> commandList = new ArrayList<>();

	@Override
	public List<Pair<ParseType, String>> parseLemma() {
		List<Pair<ParseType, String>> lemma = new ArrayList<>();
		
		for (CommandVO cmd : commandList) {
			String keyString = cmd.getCommand();
			Pair<ParseType, String> key = new Pair<>(ParseType.KEY, keyString);
			
			String valString = cmd.getExplain();
			Pair<ParseType, String> val = new Pair<>(ParseType.VAL, valString);
			
			lemma.add(key);
			lemma.add(val);
			
			
		}
		
		return lemma;
	}
}
