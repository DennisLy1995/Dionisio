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

import com.Dionisio.Dionisio.Domain.MOVIE_POSTER;
import com.Dionisio.Dionisio.Repository.MoviePosterRepository;

@CrossOrigin(origins="*")
@RestController
public class MoviePosterController {

	@Autowired
	public MoviePosterRepository repoMP;
	
	
	//Methods related to Movie posters.
	
	@GetMapping("/AllMoviePosters")
	public List<MOVIE_POSTER> getAllMoviePosters() {
		List<MOVIE_POSTER> posters = repoMP.findAll();
		return posters;
	}

	
	@PostMapping("/registerMoviePoster")
	public String postmoviePoster(@RequestBody MOVIE_POSTER moviePoster) {
		try {
			repoMP.save(moviePoster);
			return "moviePoster register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyMoviePoster")
	public String putmoviePoster(@RequestBody MOVIE_POSTER moviePoster) {
		try {
			repoMP.save(moviePoster);
			return "moviePoster modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteMoviePoster")
	public String deletemoviePoster(@RequestBody MOVIE_POSTER moviePoster) {
		try {
			repoMP.delete(moviePoster);
			return "moviePoster deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
