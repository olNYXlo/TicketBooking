package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Movie;
import pojo.MovieListings;
import pojo.MovieSeats;


@Controller
@RequestMapping(value="/{name}")
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
	
	@RequestMapping
	public String showListings(@PathVariable String name, Model Model,@ModelAttribute("MovieListings") MovieListings Listings) {
		
		Movie SelectedMovie = Listings.getMovieListing().get(name);
		// Creates new MovieListing Object & adds it as an attribute
		
		
		Model.addAttribute("Movie",SelectedMovie);
		// Allows jsp to read its value
		// similar to ReacJS passing State
		
		return name;
	}
	
	@RequestMapping("/PickTimeSlot")
	public String processSelection(@PathVariable String name,@ModelAttribute("Movie") Movie SelectedMovie,Model Model) {
		
		//log the input data
		String timeslot = SelectedMovie.getSelection();
		
		
		MovieSeats SeatSelection = SelectedMovie.getTimeSlots().get(timeslot);
		
		Model.addAttribute("MovieSeats",SeatSelection);
		// Allows jsp to read its value
		// similar to ReacJS passing State
		
		
		return "redirect:/" + name + "/" + timeslot;
		// this will redirect the URL to match the /MovieName
		
	}
	
	
	
	
	@RequestMapping(value = "/{time}")
	public String showSeats(@PathVariable String name, @PathVariable String time, Model Model,@ModelAttribute("MovieSeats") MovieSeats SeatSelection) {
		
		
		return "/MovieListings/"+name+time;
		// This is for easier & neater file arrangement
		// Rather than making another servlet to direct the source folder
		// of JSP files
	}
	
	

	
}
