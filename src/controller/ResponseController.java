package controller;


import java.util.LinkedHashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pojo.MovieSeats;
import pojo.Responder;

@RestController
// @Controller
public class ResponseController {
	

	@GetMapping("/Reply")
	// public  @ResponseBody Responder ReplyMe() {
	public Responder ReplyMe() {
		//ResponseBody serializes an object & returns it
		return new Responder("Toodle Loo","Everyone");
	}
	
	
	
	
	@RequestMapping("/Response")
	// public  @ResponseBody String Response() {
	public String Response() {
		return "Hello Everyone";
	}
	
	
	
	
	@PostMapping("/Request")
	public String Greeting(@RequestBody Responder reply) {
		//RequestBody takes in an object & deserializes it for use
		String name = reply.getName();
		String text = reply.getText();
		return text +" " + name;
		
	}
	
	@PutMapping("/Put")
	public Responder Putting(@RequestBody Responder reply) {
		reply.setName("Jack Sparrow");
		reply.setText("Today is that day that you almost caught ");
		
		return reply;
		
	}
	
	
	@PostMapping("/SelectSeat/{seat}")
	public MovieSeats PostingSeat(@PathVariable String seat,@RequestBody MovieSeats Seats) {
		Seats.getSeats().put(seat, 1);
		return Seats;
		
	}
	
	
	
	@PutMapping(value = "/SelectSeats/{seats}")
	public MovieSeats SelectingSeats(@PathVariable String seats, @RequestBody MovieSeats Seats) {
		
		
		LinkedHashMap<String, Integer> newseats = new LinkedHashMap<String, Integer>();
		newseats.put("C1", 0);
		newseats.put("C2", 0);
		newseats.put("C3", 0);
		newseats.put("C4", 0);
		newseats.put("C1", 1);
		Seats.setSeats(newseats);
		
		/*
		String[] selectedSeats = seats.split("&");
		for (String pickedSeat : selectedSeats) {
			Seats.getSeats().remove(pickedSeat);
			Seats.getSeats().put(pickedSeat, 1);
		}	
		*/
		
		return Seats;
		
	}
	
	
	@DeleteMapping("/DeleteSeat/{seat}")
	public MovieSeats DeletingSeat (@PathVariable String seat,@RequestBody MovieSeats Seats) {
		Seats.getSeats().remove(seat);		
		return Seats;
	}
	
}
