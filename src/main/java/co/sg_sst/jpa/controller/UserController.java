package co.sg_sst.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sg_sst.jpa.model.UserEntity;
import co.sg_sst.jpa.service.UserService;

@Controller
public class UserController {

	private final static String USER_ROOT = "users";
	
	@Autowired
	private UserService repository;

	@DeleteMapping(USER_ROOT + "/deleteAll")
	private void deleteAll() {
		repository.deleteAll();

	}
	
	@PostMapping(USER_ROOT + "/create")
	@ResponseBody
	private UserEntity createUser(@RequestParam String name, @RequestParam String area, @RequestParam String username, @RequestParam String password, @RequestParam List<String> permissions) {
			
		UserEntity user = repository.save(new UserEntity (name, area, username, password, permissions));
		return user;
	}

	@GetMapping(USER_ROOT + "/search")
	@ResponseBody
	private List<UserEntity> findByName(@RequestParam String name) {
		return repository.findByName(name);

	}
}
