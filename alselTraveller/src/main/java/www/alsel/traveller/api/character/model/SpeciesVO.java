package www.alsel.traveller.api.character.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import www.alsel.traveller.api.language.model.LanguageVO;

@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
public class SpeciesVO {
	private String name;
	private String introduce;
	private LanguageVO nativeLanguage;
}
