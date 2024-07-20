package www.alsel.traveller.bot.command.api;

import org.springframework.http.HttpMethod;

public interface RequestStrategy {
	
	public <B> String requestTo(String urlTail, HttpMethod method, B body);

}
