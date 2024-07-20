package www.alsel.traveller.bot.parser.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import www.alsel.traveller.bot.model.data.SimpleMessageVO;
import www.alsel.traveller.bot.model.structure.Pair;
import www.alsel.traveller.bot.parser.DiscordParser;

@AllArgsConstructor
public class SimpleMessageParser extends DiscordParser {
	private SimpleMessageVO vo;
	
	@Override
	public List<Pair<ParseType, String>> parseLemma() {
		
		List<Pair<ParseType, String>> lemma = new ArrayList<>();

		String keyString = vo.getClass().getDeclaredFields()[0].getName();
		Pair<ParseType, String> key = new Pair<>(ParseType.KEY, keyString);
		
		String valString = vo.getMessage();
		Pair<ParseType, String> val = new Pair<>(ParseType.VAL, valString);
		
		lemma.add(key);
		lemma.add(val);

		return lemma;
	}
}
