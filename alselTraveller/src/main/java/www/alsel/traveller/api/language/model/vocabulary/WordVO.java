package www.alsel.traveller.api.language.model.vocabulary;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import www.alsel.traveller.api.language.model.ExpressionDTO;

@Getter
@NoArgsConstructor
public class WordVO extends ExpressionDTO {
	private List<MeaningVO> meaningMap;
}
