package www.alsel.traveller.api.language.model.phonology;

import java.util.List;

import lombok.Getter;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
public class PhonemeVO extends Entity {
	private String ipa;
	private String romanExpression;
	private String fontExpression;
	
	private List<PhonologicalPropertyVO> propertyList;
}
