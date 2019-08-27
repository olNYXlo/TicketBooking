package controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	
}
