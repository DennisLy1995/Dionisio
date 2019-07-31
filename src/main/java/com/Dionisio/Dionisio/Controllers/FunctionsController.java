package com.Dionisio.Dionisio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Dionisio.Dionisio.Domain.FUNCTIONS;
import com.Dionisio.Dionisio.Repository.FunctionsRepository;

@RestController
public class FunctionsController {

	
	@Autowired
	public FunctionsRepository repoF;
	
	
	
	//Methods related to Functions.
	
	@GetMapping("/AllFunctions")
	public List<FUNCTIONS> getAllFunctions() {
		List<FUNCTIONS> functions = repoF.findAll();
		return functions;
	}
	
	
	
	@PostMapping("/registerFunction")
	public String postFunction(@RequestBody FUNCTIONS function) {
		try {
			repoF.save(function);
			return "Function register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyFunction")
	public String putFunction(@RequestBody FUNCTIONS function) {
		try {
			repoF.save(function);
			return "Function modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteFunction")
	public String deleteFunction(@RequestBody FUNCTIONS function) {
		try {
			repoF.delete(function);
			return "Function deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
