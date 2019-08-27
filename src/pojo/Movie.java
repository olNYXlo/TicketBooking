package pojo;

import java.util.LinkedHashMap;

public class Movie {
	// Movie has a name
	// Movie has multiple Screening Times & its respective available seats

	private String name;
	private String Selection;
	//String selection is useless. 
	// only have it to enable the radiobutton function
	private LinkedHashMap<String,MovieSeats> TimeSlots = new LinkedHashMap<String,MovieSeats>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedHashMap<String, MovieSeats> getTimeSlots() {
		return TimeSlots;
	}
	public void setTimeSlots(LinkedHashMap<String, MovieSeats> timeSlots) {
		TimeSlots = timeSlots;
	}
	
	public Movie(String MovName) {
		name = MovName;
	}
	public String getSelection() {
		return Selection;
	}
	public void setSelection(String selection) {
		Selection = selection;
	}
	
	
		
	
	
	
}
