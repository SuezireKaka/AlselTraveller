package www.alsel.traveller.api.language.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExpressionVO {
	private LanguageVO language;
	private String expression;
	
	public boolean isSafe() {
		return language.isSafeExpression(expression);
	}
}
