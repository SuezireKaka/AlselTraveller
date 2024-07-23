package www.alsel.traveller.api.language.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExpressionVO {
	private LanguageVO language;
	private String expression;
	
	public boolean isPhonologicallySafe() {
		return language.getPhonology().isPhonologicallySafe(expression);
	}
	
	public boolean isCorrectWord() {
		return language.getVocabulary().isCorrectWord(expression);
	}
}
