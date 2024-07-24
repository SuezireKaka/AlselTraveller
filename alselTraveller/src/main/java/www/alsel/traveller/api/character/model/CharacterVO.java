package www.alsel.traveller.api.character.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.TimeEntity;

@Getter
@NoArgsConstructor
public class CharacterVO extends TimeEntity {
	public String name;
	public SpeciesVO spices;
}
