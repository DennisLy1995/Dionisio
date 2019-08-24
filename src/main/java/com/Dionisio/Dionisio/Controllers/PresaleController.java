package com.Dionisio.Dionisio.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Dionisio.Dionisio.Domain.PRESALES;
import com.Dionisio.Dionisio.Repository.PresaleRepository;

@CrossOrigin(origins="*")
@RestController
public class PresaleController {

	@Autowired
	public PresaleRepository repoPS;
	
	
	//Methods related to Presales.
	
	@GetMapping("/AllPresales")
	public List<PRESALES> getAllPresales() {
		List<PRESALES> presales = repoPS.findAll();
		return presales;
	}
	

	@PostMapping("/registerPresale")
	public String postpresale(@RequestBody PRESALES presale) {
		try {
			repoPS.save(presale);
			return "presale register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyPresale")
	public String putpresale(@RequestBody PRESALES presale) {
		try {
			repoPS.save(presale);
			return "presale modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deletePresale")
	public String deletepresale(@RequestBody PRESALES presale) {
		try {
			repoPS.delete(presale);
			return "presale deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
