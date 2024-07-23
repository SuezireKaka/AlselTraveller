package www.alsel.traveller.api.language.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LanguageVO {
	private String name;
	private String intro;
	private List<WordVO> wordList = new ArrayList<>();
	private List<GrammarCategoryVO> grammarList = new ArrayList<>();
	
	public boolean isSafeExpression(String expression) {
		return false;
	}
}
