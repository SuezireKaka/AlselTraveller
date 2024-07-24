package www.alsel.traveller.api.language.model.phonology;

import lombok.Getter;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
public class PhonemeVO extends Entity {
	private String romanExpression;
	private String fontExpression;
}
