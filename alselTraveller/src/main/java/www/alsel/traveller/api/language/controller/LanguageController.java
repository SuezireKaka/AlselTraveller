package www.alsel.traveller.api.language.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.alsel.traveller.api.language.model.LanguageVO;
import www.alsel.traveller.api.language.service.LanguageService;

@RestController		//Container에 담기도록 지정
@RequestMapping("/alsel")
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	// /alsel/anonymous/language
	@GetMapping("/anonymous/language")
	public ResponseEntity<List<LanguageVO>> listAllLanguages() {
		List<LanguageVO> result = languageService.listAllLanguages();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
