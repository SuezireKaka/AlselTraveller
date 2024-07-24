package www.alsel.traveller.api.character.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;
import www.alsel.traveller.api.language.model.LanguageVO;

@Getter
@NoArgsConstructor
public class SpeciesVO extends Entity {
	private String name;
	private String introduce;
	private LanguageVO nativeLanguage;
}
