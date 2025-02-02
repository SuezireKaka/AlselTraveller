package www.alsel.traveller.bot.view.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import www.alsel.traveller.bot.model.structure.Pair;
import www.alsel.traveller.bot.parser.DiscordContents;
import www.alsel.traveller.bot.parser.ContentsParser.ParseType;
import www.alsel.traveller.bot.view.DiscordView;

@Getter
@Builder
public class AdditionalRequestView extends DiscordView {
	private String title;
	private DiscordContents contents;
	
	@Override
	public <T> void init(Class<T> cls) throws Exception {
		String usage = (String) cls.getField("USAGE").get("");
		
		setEmbedBuilder(this.getEmbedBuilder()
				.setTitle(usage)
				.setDescription(usage + RESULT_TITLE_SUFFIX)
				.setColor(SUCCESS_COLOR));
	}

	@Override
	public Pair<List<MessageEmbed>, File> close() throws Exception {
		List<List<Pair<ParseType, String>>> parsedContents = contents.getContents();
		
		List<MessageEmbed> embedList = new ArrayList<>();
		
		for (List<Pair<ParseType, String>> lemma : parsedContents) {
			EmbedBuilder safeBuilder = this.getEmbedBuilder();
			
			for (int i = 0; i < lemma.size(); i++) {
				String key = lemma.size() % 2 == i + 1
						? ""
						: lemma.get(i).getSecond();
				
				i++;
				
				String val = lemma.get(i).getSecond();
				
				safeBuilder.addField(key, val, false);
			}
			
			embedList.add(safeBuilder.build());
		}
		
		return new Pair<>(embedList, contents.getParser().extractFile());
	}

}
