package www.alsel.traveller.api.language.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LanguageVO {
	public String name;
	public List<WordVO> wordList;
}
