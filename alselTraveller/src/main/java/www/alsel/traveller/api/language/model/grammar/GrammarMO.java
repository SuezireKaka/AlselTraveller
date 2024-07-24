package www.alsel.traveller.api.language.model.grammar;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GrammarMO {
	private List<GrammarCategoryVO> categoryList = new ArrayList<>();
}
