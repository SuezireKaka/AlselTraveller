package www.alsel.traveller.api.language.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.framework.model.Entity;
import www.alsel.traveller.api.language.model.grammar.GrammarMO;
import www.alsel.traveller.api.language.model.phonology.PhonologyVO;
import www.alsel.traveller.api.language.model.vocabulary.VocabularyMO;

@Getter
@NoArgsConstructor
public class LanguageVO extends Entity {
	private String name;
	private String intro;
	
	private PhonologyVO phonology;
	private VocabularyMO vocabulary;
	private GrammarMO grammar;
}
