package www.alsel.traveller.api.language.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LanguageConfig {
	@Value("#{'${dic.api.address}'}")
	private String dicAddress;
}
