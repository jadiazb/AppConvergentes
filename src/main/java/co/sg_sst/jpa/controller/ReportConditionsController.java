package co.sg_sst.jpa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.sg_sst.jpa.model.ReportConditionsEntity;
import co.sg_sst.jpa.service.ReportConditionsService;

@Controller
public class ReportConditionsController {

	private final static String CONDITION_ROOT = "conditions";

	@Autowired
	private ReportConditionsService repository;

	@DeleteMapping(CONDITION_ROOT + "/deleteAll")
	private void deleteAll() {
		repository.deleteAll();

	}

	@PostMapping(CONDITION_ROOT + "/report")
	@ResponseBody
	private ReportConditionsEntity createElement(@RequestParam String id, @RequestParam String condition,
			@RequestParam String description, @RequestParam String controlProposal, @RequestParam String photo) {

		ReportConditionsEntity element = repository
				.save(new ReportConditionsEntity(id, condition, description, controlProposal, photo));
		return element;
	}

	@GetMapping(CONDITION_ROOT + "/search")
	@ResponseBody
	private List<ReportConditionsEntity> findByCondition(@RequestParam String condition) {
		return repository.findByCondition(condition);

	}

}
