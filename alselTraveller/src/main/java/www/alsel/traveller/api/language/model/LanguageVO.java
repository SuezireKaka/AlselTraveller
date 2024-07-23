package www.alsel.traveller.api.language.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.language.model.phonology.PhonemeVO;

@Getter
@NoArgsConstructor
public class LanguageVO {
	private String name;
	private String intro;
	
	private List<PhonemeVO> phonology = new ArrayList<>();
	private List<WordVO> wordList = new ArrayList<>();
	private List<GrammarCategoryVO> grammarList = new ArrayList<>();
	
	public boolean isPhonologicallySafe(String expression) {
		return false;
	}
}
