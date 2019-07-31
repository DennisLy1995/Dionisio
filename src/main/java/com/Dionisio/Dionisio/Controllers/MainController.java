package com.Dionisio.Dionisio.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	

	//Here starts the REST methods (GET, POST, PUT and DELETE)
	
		
	@GetMapping
	public String main() {
		return "Pagina principal del cine Dionisio!!!";
	}
	
}
