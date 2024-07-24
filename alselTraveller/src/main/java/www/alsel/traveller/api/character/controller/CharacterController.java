package www.alsel.traveller.api.character.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.alsel.traveller.api.character.model.CharacterVO;
import www.alsel.traveller.api.character.service.CharacterService;
import www.alsel.traveller.bot.command.ApiCommand;

@RestController		//Container에 담기도록 지정
@RequestMapping(ApiCommand.CHARACTER)
public class CharacterController {
	@Autowired
	private CharacterService kittogishService;
	
	// /character/anonymous/listAll
	@GetMapping(ApiCommand.ANONYMOUS + ApiCommand.LIST_ALL)
	public ResponseEntity<List<CharacterVO>> listAllCharacters() {
		List<CharacterVO> result = kittogishService.listAllCharacters();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
