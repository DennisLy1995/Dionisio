package com.Dionisio.Dionisio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dionisio.Dionisio.Domain.ACCOUNT;
import com.Dionisio.Dionisio.Repository.AccountRepository;

@RestController
public class AccountsController {

	
	@Autowired
	public AccountRepository repoA;

	
	//Methods related to Accounts
	
	@GetMapping("/AllAccounts")
	public List<ACCOUNT> getAllAccounts() {
		List<ACCOUNT> accounts = repoA.findAll();
		return accounts;
	}
	
	@PostMapping("/registerAccount")
	public String postAccount(@RequestBody ACCOUNT account) {
		try {
			repoA.save(account);
			return "Account register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyAccount")
	public String putAccount(@RequestBody ACCOUNT account) {
		try {
			repoA.save(account);
			return "Account modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteAccount")
	public String deleteAccount(@RequestBody ACCOUNT account) {
		try {
			repoA.delete(account);
			return "Account deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
}
