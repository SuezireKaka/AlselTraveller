package www.alsel.traveller.api.language.model.phonology;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PhonologyVO {
	private List<PhonemeVO> phonology = new ArrayList<>();
	
	public boolean isPhonologicallySafe(String expression) {
		return false;
	}
}
