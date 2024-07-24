package www.alsel.traveller.api.character.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import www.alsel.traveller.api.character.model.CharacterVO;

@Mapper
public interface CharacterMapper {
	public List<CharacterVO> listAllCharacters();

}
