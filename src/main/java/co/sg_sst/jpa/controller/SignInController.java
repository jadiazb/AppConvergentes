package co.sg_sst.jpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sg_sst.jpa.exception.SignInResponse;
import co.sg_sst.jpa.model.SignInEntity;
import co.sg_sst.jpa.service.SignInService;

@Controller
public class SignInController {

	private final static String LOGIN_ROOT = "login";

	@Autowired
	private SignInService repository;

	@DeleteMapping(LOGIN_ROOT + "/deleteAll")
	private void deleteAll() {
		repository.deleteAll();

	}

	@PostMapping(LOGIN_ROOT + "/create")
	@ResponseBody
	private SignInEntity createElement(@RequestParam String email, @RequestParam String password) {

		SignInEntity element = repository.save(new SignInEntity(email, password));
		return element;
	}

	@GetMapping(LOGIN_ROOT + "/search")
	@ResponseBody
	private SignInEntity findByEmail(@RequestParam String email) {
		return repository.findByEmail(email);
	}

	@PostMapping(LOGIN_ROOT + "/signin")
	@ResponseBody
	private SignInResponse signIn(@Valid @RequestBody SignInEntity signInEntity) {
		
		SignInResponse signInResponse = null;
		SignInEntity user = repository.findByEmail(signInEntity.getEmail());
		

		if (user != null) {
			if (user.getPassword().equals(signInEntity.getPassword())) {
				signInResponse = new SignInResponse("Se ha logeado correctamente", SignInResponse.statusCode.OK);
			} else {
				signInResponse = new SignInResponse("La contraseña ingresada es incorrecta", SignInResponse.statusCode.ERROR);
			}
		} else {
			signInResponse = new SignInResponse("El usuario no existe", SignInResponse.statusCode.ERROR);
		}
		
		return signInResponse;
	}
}