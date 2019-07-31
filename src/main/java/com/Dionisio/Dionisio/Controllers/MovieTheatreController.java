package com.Dionisio.Dionisio.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Dionisio.Dionisio.Domain.MOVIE_THEATRE;
import com.Dionisio.Dionisio.Repository.MovieTheatreRepository;

@RestController
public class MovieTheatreController {

	
	@Autowired
	public MovieTheatreRepository repoMT;
	
	
	//Methods related to Movie theatres.
	
	@GetMapping("/AllMovieTheatres")
	public List<MOVIE_THEATRE> getAllMovieTheatres() {
		List<MOVIE_THEATRE> theatres = repoMT.findAll();
		return theatres;
	}
	

	@PostMapping("/registerMovieTheatre")
	public String postmovieTheatre(@RequestBody MOVIE_THEATRE movieTheatre) {
		try {
			repoMT.save(movieTheatre);
			return "movieTheatre register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyMovieTheatre")
	public String putmovieTheatre(@RequestBody MOVIE_THEATRE movieTheatre) {
		try {
			repoMT.save(movieTheatre);
			return "movieTheatre modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteMovieTheatre")
	public String deletemovieTheatre(@RequestBody MOVIE_THEATRE movieTheatre) {
		try {
			repoMT.delete(movieTheatre);
			return "movieTheatre deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
