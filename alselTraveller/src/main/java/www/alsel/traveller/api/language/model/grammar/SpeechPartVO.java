package www.alsel.traveller.api.language.model.grammar;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;

@Getter
@NoArgsConstructor
public class SpeechPartVO extends Entity {
	private List<GrammarCategoryVO> categoryList;
	private String type;
}
