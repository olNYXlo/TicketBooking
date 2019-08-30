package pojo;

import java.util.LinkedHashMap;

public class MovieListings {
	
	//Movie listing has multiple movies
	
	private String Selection;
	//String selection is useless. 
	// only have it to enable the radiobutton function
	
	private LinkedHashMap<String,Movie> movieListing = new LinkedHashMap<String,Movie>();
	


	public LinkedHashMap<String, Movie> getMovieListing() {
		return movieListing;
	}



	public void setMovieListing(LinkedHashMap<String, Movie> movieListing) {
		this.movieListing = movieListing;
	}
	
	
	
	public String getSelection() {
		return Selection;
	}



	public void setSelection(String selection) {
		Selection = selection;
	}



	public MovieListings(){
		
		Movie Terminator = new Movie("Terminator");
		Movie Terminator2 = new Movie("Terminator 2");
		Movie Terminator3 = new Movie("Terminator 3");
		Movie Terminator4 = new Movie("Terminator 4");
		
		MovieSeats T = new MovieSeats();
		MovieSeats T2 = new MovieSeats();
		MovieSeats T3 = new MovieSeats();
		MovieSeats T4 = new MovieSeats();
		
		Terminator.getTimeSlots().put("1200", T);
		Terminator.getTimeSlots().put("1400", T2);
		Terminator.getTimeSlots().put("1600", T3);
		Terminator.getTimeSlots().put("1800", T4);
		
		Terminator2.getTimeSlots().put("1220", T);
		Terminator2.getTimeSlots().put("1420", T2);
		Terminator2.getTimeSlots().put("1620", T3);
		Terminator2.getTimeSlots().put("1820", T4);
		
		Terminator3.getTimeSlots().put("1230", T);
		Terminator3.getTimeSlots().put("1430", T2);
		Terminator3.getTimeSlots().put("1630", T3);
		Terminator3.getTimeSlots().put("1830", T4);
		
		Terminator4.getTimeSlots().put("1240", T);
		Terminator4.getTimeSlots().put("1440", T2);
		Terminator4.getTimeSlots().put("1640", T3);
		Terminator4.getTimeSlots().put("1840", T4);
		
		movieListing.put("Terminator", Terminator);
		movieListing.put("Terminator 2", Terminator2);
		movieListing.put("Terminator 3", Terminator3);
		movieListing.put("Terminator 4", Terminator4);
		
	}
	
	public static void main (String args[]) {
		MovieListings m1 = new MovieListings();
		System.out.println(m1.movieListing.keySet());
		System.out.println(m1.movieListing.get("Terminator").getName());
		
		
	}


}
