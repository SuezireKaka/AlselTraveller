package www.alsel.traveller.api.language.model.vocabulary;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.character.model.SpeciesVO;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
@NoArgsConstructor
public class MeaningVO extends Entity {
	private String meaning;
	private SpeciesVO origin;
}
