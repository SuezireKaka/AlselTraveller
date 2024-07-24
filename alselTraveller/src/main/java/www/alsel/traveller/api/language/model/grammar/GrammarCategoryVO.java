package www.alsel.traveller.api.language.model.grammar;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
@NoArgsConstructor
public class GrammarCategoryVO extends Entity {
	private String category;
	private String expression;
}
