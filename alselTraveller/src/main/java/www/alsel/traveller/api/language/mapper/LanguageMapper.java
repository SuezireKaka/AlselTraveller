package www.alsel.traveller.api.language.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import www.alsel.traveller.api.framework.mapper.GeneralMapper;
import www.alsel.traveller.api.language.model.LanguageVO;

@Mapper
public interface LanguageMapper extends GeneralMapper {
	public List<LanguageVO> listAllLanguages();
}
