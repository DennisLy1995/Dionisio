package com.Dionisio.Dionisio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dionisio.Dionisio.Domain.EMAIL;
import com.Dionisio.Dionisio.Repository.EmailRepository;

@RestController
public class EmailController {

	@Autowired
	public EmailRepository repoE;
	
	
	//Methods related to Emails.
	
	@GetMapping("/AllEmails")
	public List<EMAIL> getAllEmails() {
		List<EMAIL> emails = repoE.findAll();
		return emails;
	}
	
	@PostMapping("/registerEmail")
	public String postEmail(@RequestBody EMAIL email) {
		try {
			repoE.save(email);
			return "Email register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyEmail")
	public String putEmail(@RequestBody EMAIL email) {
		try {
			repoE.save(email);
			return "Email modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteEmail")
	public String deleteEmail(@RequestBody EMAIL email) {
		try {
			repoE.delete(email);
			return "Email deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
}
