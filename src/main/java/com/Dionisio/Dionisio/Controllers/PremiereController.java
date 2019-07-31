package com.Dionisio.Dionisio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Dionisio.Dionisio.Domain.PREMIERES;
import com.Dionisio.Dionisio.Repository.PremiereRepository;

@RestController
public class PremiereController {

	@Autowired
	public PremiereRepository repoPM;
	
	
	//Methods related to Premieres.
	
	@GetMapping("/AllPremieres")
	public List<PREMIERES> getAllPremieres() {
		List<PREMIERES> premieres = repoPM.findAll();
		return premieres;
	}
	

	@PostMapping("/registerPremiere")
	public String postpremiere(@RequestBody PREMIERES premiere) {
		try {
			repoPM.save(premiere);
			return "premiere register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyPremiere")
	public String putpremiere(@RequestBody PREMIERES premiere) {
		try {
			repoPM.save(premiere);
			return "premiere modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deletePremiere")
	public String deletepremiere(@RequestBody PREMIERES premiere) {
		try {
			repoPM.delete(premiere);
			return "premiere deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
