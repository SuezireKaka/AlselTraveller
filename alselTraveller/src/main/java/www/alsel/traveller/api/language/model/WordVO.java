package www.alsel.traveller.api.language.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WordVO extends ExpressionVO {
	private Map<SpeechPartVO, List<MeaningVO>> meaningMap;
}
