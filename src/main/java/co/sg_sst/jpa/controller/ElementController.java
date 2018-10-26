package co.sg_sst.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sg_sst.jpa.model.ElementEntity;
import co.sg_sst.jpa.service.ElementService;

@Controller
public class ElementController {

	private final static String ELEMENT_ROOT = "elements";
	
	@Autowired
	private ElementService repository;

	@DeleteMapping(ELEMENT_ROOT + "/deleteAll")
	private void deleteAll() {
		repository.deleteAll();

	}
	
	@PostMapping(ELEMENT_ROOT + "/create")
	@ResponseBody
	private ElementEntity createElement(@RequestParam String id,@RequestParam String name, @RequestParam String description, @RequestParam String image) {
			
		ElementEntity element = repository.save(new ElementEntity(id, name, description, image));
		return element;
	}

	@GetMapping(ELEMENT_ROOT + "/search")
	@ResponseBody
	private List<ElementEntity> findByName(@RequestParam String name) {
		return repository.findByName(name);

	}
}

