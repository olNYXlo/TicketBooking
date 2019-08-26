package pojo;

import java.util.LinkedHashMap;

public class MovieSeats {
	
	
	//Hash Map of seats
	// use of 0 to represent empty seat & 1 to represent filled seat
	// will be like "A1", 0	"A2", 1 etc
	private LinkedHashMap<String, Integer> movieSlots = new LinkedHashMap<String, Integer>();

	public LinkedHashMap<String, Integer> getMovieSlots() {
		return movieSlots;
	}

	public void setMovieSlots(LinkedHashMap<String, Integer> movieSlots) {
		this.movieSlots = movieSlots;
	}
	
	public MovieSeats() {
		
		
		movieSlots.put("A1", 1);
		movieSlots.put("A2", 0);
		movieSlots.put("A3", 0);
		movieSlots.put("A4", 0);
		movieSlots.put("A5", 0);
		
		movieSlots.put("B1", 0);
		movieSlots.put("B2", 1);
		movieSlots.put("B3", 0);
		movieSlots.put("B4", 0);
		movieSlots.put("B5", 0);
		
	}

}
