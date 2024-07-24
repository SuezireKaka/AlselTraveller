package www.alsel.traveller.api.language.model.vocabulary;

import java.util.ArrayList;
import java.util.List;

public class VocabularyMO {
	private List<WordVO> wordList = new ArrayList<>();
	
	public boolean isCorrectWord(String expression) {
		return wordList.stream().anyMatch(word -> expression.equals(word.getExpression()));
	}
}