package www.alsel.traveller.bot.view;

import lombok.Getter;
import lombok.Setter;
import net.dv8tion.jda.api.EmbedBuilder;
import www.alsel.traveller.AlselTravellerApplication;

@Getter
@Setter
public abstract class DiscordView implements View {
	private EmbedBuilder embedBuilder = new EmbedBuilder().setAuthor(
			AlselTravellerApplication.callJda().getSelfUser().getName());
	
	public String extractUsage(Class<?> cls) throws Exception {
		return (String) cls.getField("USAGE").get("");
	}
}
