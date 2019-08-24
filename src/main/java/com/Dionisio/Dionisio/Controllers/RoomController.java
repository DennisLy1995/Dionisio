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
import com.Dionisio.Dionisio.Domain.ROOM;
import com.Dionisio.Dionisio.Repository.RoomRepository;

@CrossOrigin(origins="*")
@RestController
public class RoomController {

	@Autowired
	public RoomRepository repoR;
	
	
	//Methods related to Rooms.
	
	@GetMapping("/AllRooms")
	public List<ROOM> getAllRooms() {
		List<ROOM> rooms = repoR.findAll();
		return rooms;
	}
	

	@PostMapping("/registerRoom")
	public String postroom(@RequestBody ROOM room) {
		try {
			repoR.save(room);
			return "room register!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	@PutMapping("/modifyRoom")
	public String putroom(@RequestBody ROOM room) {
		try {
			repoR.save(room);
			return "room modified!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
	
	@DeleteMapping("/deleteRoom")
	public String deleteroom(@RequestBody ROOM room) {
		try {
			repoR.delete(room);
			return "room deleted!!!";
		}catch(Exception e) {
			return "Something went wrong!!!";
		}
	}
	
}
