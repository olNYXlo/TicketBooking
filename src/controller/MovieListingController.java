package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.MovieListings;


@Controller
public class MovieListingController {
	
	
	/*
	@RequestMapping("/Terminator")
	public String showTListings(Model Model) {
		MovieListings Listings = new MovieListings();
		
		Model.addAttribute("MovieListings",Listings);
		return "Terminator";
	}
	
	@RequestMapping("/Terminator2")
	public String showT2Listings(Model Model) {
		MovieListings Listings = new MovieListings();
		
		Model.addAttribute("MovieListings",Listings);
		
		return "Terminator2";
	}
	@RequestMapping("/Terminator3")
	public String showT3Listings(Model Model) {
		MovieListings Listings = new MovieListings();
		
		Model.addAttribute("MovieListings",Listings);
		return "Terminator3";
	}
	@RequestMapping("/Terminator4")
	public String showT4Listings(Model Model) {
		MovieListings Listings = new MovieListings();
		
		Model.addAttribute("MovieListings",Listings);
		return "Terminator4";
	}
	*/
	
	
	// To map all URL redirects for all movies to match their movie name
	// Instead of individually mapping every single Movie Name
	@RequestMapping(value = "/{name}",method = RequestMethod.GET)
	public String showListings(@PathVariable String name, Model Model) {
		
		MovieListings Listings = new MovieListings();
		// Creates new MovieListing Object & adds it as an attribute
		
		Model.addAttribute("MovieListings",Listings);
		// Allows jsp to read its value
		// similar to ReacJS passing State
		
		return name;
	}
	
	

	
}
