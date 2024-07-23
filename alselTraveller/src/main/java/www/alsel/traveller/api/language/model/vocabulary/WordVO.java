package www.alsel.traveller.api.language.model.vocabulary;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.language.model.ExpressionVO;
import www.alsel.traveller.api.language.model.grammar.SpeechPartVO;

@Getter
@NoArgsConstructor
public class WordVO extends ExpressionVO {
	private Map<SpeechPartVO, List<MeaningVO>> meaningMap;
}
