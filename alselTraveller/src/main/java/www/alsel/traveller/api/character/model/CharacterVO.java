package www.alsel.traveller.api.character.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
@NoArgsConstructor
public class CharacterVO extends Entity {
	public String name;
	public String gender;
	public String introduce;

	public List<SpeciesVO> speciesList;
}
