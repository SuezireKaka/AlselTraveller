package www.alsel.traveller.api.language.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.alsel.traveller.api.language.mapper.LanguageMapper;
import www.alsel.traveller.api.language.model.LanguageVO;

@Service
public class LanguageService {	
	@Autowired
	private LanguageMapper languageMapper;

	public List<LanguageVO> listAllLanguages() {
		return languageMapper.listAllLanguages();
	}	
}
