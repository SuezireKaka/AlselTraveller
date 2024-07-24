package www.alsel.traveller.api.character.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.TimeEntity;

@Getter
@NoArgsConstructor
public class CharacterVO extends TimeEntity {
	public String name;
	public String gender;

	public List<SpeciesVO> spices;
	public List<EducatedSpecVO> eduSpecList;
	
	public String introduce;
}
