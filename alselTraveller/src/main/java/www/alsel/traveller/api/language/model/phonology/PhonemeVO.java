package www.alsel.traveller.api.language.model.phonology;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class PhonemeVO {
	private List<PhonemeVO> phonology = new ArrayList<>();
	
	public boolean isPhonologicallySafe(String expression) {
		return false;
	}
}
