package www.alsel.traveller.api.language.model.phonology;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
@NoArgsConstructor
public class PhonologicalPropertyVO extends Entity {
	private String contraction;
	private String expression;
}
