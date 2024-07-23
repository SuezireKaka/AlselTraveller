package www.alsel.traveller.api.language.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LanguageVO {
	private String name;
	private List<WordVO> wordList;
}
