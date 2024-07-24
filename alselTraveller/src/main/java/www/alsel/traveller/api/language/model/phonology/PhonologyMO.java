package www.alsel.traveller.api.language.model.phonology;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PhonologyMO {
	private List<PhonemeVO> phonemeList = new ArrayList<>();
	
	public boolean isPhonologicallySafe(String expression) {
		return false;
	}
}
