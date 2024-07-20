package www.alsel.traveller.api.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.alsel.traveller.api.party.model.UserVO;
import www.alsel.traveller.api.party.service.PartyService;
import www.alsel.traveller.api.security.model.SignUpResultDTO;
import www.alsel.traveller.bot.command.ApiCommand;

@RestController
@CrossOrigin
@RequestMapping(ApiCommand.PARTY)
public class PartyController {	
	@Autowired
	private PartyService partyService;
	
	@PostMapping(ApiCommand.CREATE)
	public ResponseEntity<SignUpResultDTO> createUser(
			@AuthenticationPrincipal UserVO user) {
		SignUpResultDTO result = partyService.createUser(user);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
