package www.alsel.traveller.api.character.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
@NoArgsConstructor
public class SpeciesVO extends Entity {
	private String name;
	private String introduce;
}
