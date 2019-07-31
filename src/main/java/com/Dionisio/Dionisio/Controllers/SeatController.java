package com.Dionisio.Dionisio.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Dionisio.Dionisio.Domain.SEAT;
import com.Dionisio.Dionisio.Repository.SeatRepository;

@RestController
public class SeatController {

	@Autowired
	public SeatRepository repoS;
	
	
	//Methods related to Seats.
	
	@GetMapping("/AllSeats")
	public List<SEAT> getAllSeats() {
		List<SEAT> seats = repoS.findAll();
		return seats;
	}
	

	@PostMapping("/registerSeat")
	public String postseat(@RequestBody SEAT seat) {
		try {
			repoS.save(seat);
			return "seat register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifySeat")
	public String putseat(@RequestBody SEAT seat) {
		try {
			repoS.save(seat);
			return "seat modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteSeat")
	public String deleteseat(@RequestBody SEAT seat) {
		try {
			repoS.delete(seat);
			return "seat deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
}
