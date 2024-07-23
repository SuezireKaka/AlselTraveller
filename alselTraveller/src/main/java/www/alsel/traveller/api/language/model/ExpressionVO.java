package www.alsel.traveller.api.language.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExpressionVO {
	private LanguageVO language;
	private String expression;
	
	public boolean isSafe() {
		return language.isSafeExpression(expression);
	}
}
