package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Movie;
import pojo.MovieListings;
import pojo.MovieSeats;
import pojo.Responder;

@Controller
public class BaseMenuController {
	
	@GetMapping("/")
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	public String showPage(Model Model) {
		MovieListings Listings = new MovieListings();
		// Creates new MovieListing Object & adds it as an attribute
		
		Model.addAttribute("MovieListings",Listings);
		// Allows jsp to read its value
		// similar to ReacJS passing State
		return "home";
	}
	
	@PostMapping("/pickMovie")
	// @RequestMapping("/pickMovie")
	public String processSelection(@ModelAttribute("MovieListings") MovieListings Listings,Model Model) {
		
		//log the input data
		String name = Listings.getSelection();
		
		Model.addAttribute("MovieListings",Listings);
		// Allows jsp to read its value
		// similar to ReacJS passing State
		
		
		return "redirect:/" + name;
		// this will redirect the URL to match the /MovieName
		
	}
	

	
	
	
	

	
}
