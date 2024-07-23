package www.alsel.traveller.api.language.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.language.model.grammar.GrammarCategoryVO;
import www.alsel.traveller.api.language.model.phonology.PhonologyVO;
import www.alsel.traveller.api.language.model.vocabulary.VocabularyVO;

@Getter
@NoArgsConstructor
public class LanguageVO {
	private String name;
	private String intro;
	
	private PhonologyVO phonology;
	private VocabularyVO vocabulary;
	private List<GrammarCategoryVO> grammarList = new ArrayList<>();
	
	
}
