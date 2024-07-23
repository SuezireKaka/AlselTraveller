package www.alsel.traveller.api.language.model.phonology;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PhonologyVO extends PhonemeVO {
	private String place;
	private String manner;
}
