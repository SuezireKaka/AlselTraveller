package www.alsel.traveller.api.character.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.alsel.traveller.api.character.mapper.CharacterMapper;
import www.alsel.traveller.api.character.model.CharacterVO;

@Service
public class CharacterService {
	@Autowired
	private CharacterMapper characterMapper;

	public List<CharacterVO> listAllCharacters() {
		return characterMapper.listAllCharacters();
	}

}
