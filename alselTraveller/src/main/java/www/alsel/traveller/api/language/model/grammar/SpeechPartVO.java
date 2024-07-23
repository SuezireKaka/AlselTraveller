package www.alsel.traveller.api.language.model.grammar;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SpeechPartVO {
	private List<GrammarCategoryVO> categoryList;
	private String type;
}
