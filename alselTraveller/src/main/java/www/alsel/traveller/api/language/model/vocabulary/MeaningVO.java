package www.alsel.traveller.api.language.model.vocabulary;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.character.model.SpeciesVO;

@Getter
@NoArgsConstructor
public class MeaningVO {
	private String meaning;
	private SpeciesVO origin;
}
