package com.Dionisio.Dionisio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Dionisio.Dionisio.Domain.MOVIE;
import com.Dionisio.Dionisio.Repository.MovieRepository;

@RestController
public class MovieController {

	@Autowired
	public MovieRepository repoM;
	
	
	//Methods related to Movies.
	
	@GetMapping("/AllMovies")
	public List<MOVIE> getAllMovies() {
		List<MOVIE> movies = repoM.findAll();
		return movies;
	}
	

	@PostMapping("/registerMovie")
	public String postmovie(@RequestBody MOVIE movie) {
		try {
			repoM.save(movie);
			return "movie register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyMovie")
	public String putmovie(@RequestBody MOVIE movie) {
		try {
			repoM.save(movie);
			return "movie modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteMovie")
	public String deletemovie(@RequestBody MOVIE movie) {
		try {
			repoM.delete(movie);
			return "movie deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
