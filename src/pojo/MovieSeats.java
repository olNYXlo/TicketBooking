package pojo;

import java.util.LinkedHashMap;

public class MovieSeats {
	
	private String Selection;
	//Hash Map of seats
	// use of 0 to represent empty seat & 1 to represent filled seat
	// will be like "A1", 0	"A2", 1 etc
	private LinkedHashMap<String, Integer> seats = new LinkedHashMap<String, Integer>();
	
	private LinkedHashMap<String, SeatRows> seatrows = new LinkedHashMap<String, SeatRows>();

	public LinkedHashMap<String, Integer> getSeats() {
		return seats;
	}

	public void setSeats(LinkedHashMap<String, Integer> seats) {
		this.seats = seats;
	}
	

	public String getSelection() {
		return Selection;
	}

	public void setSelection(String selection) {
		Selection = selection;
	}
	

	public LinkedHashMap<String, SeatRows> getSeatrows() {
		return seatrows;
	}

	public void setSeatrows(LinkedHashMap<String, SeatRows> seatrows) {
		this.seatrows = seatrows;
	}

	public MovieSeats() {
		
		
		SeatRows A = new SeatRows("A");
		SeatRows B = new SeatRows("B");
		SeatRows C = new SeatRows("C");
		SeatRows D = new SeatRows("D");
		
		
		seatrows.put("A", A);
		seatrows.put("B", B);
		seatrows.put("C", C);
		seatrows.put("D", D);
		
		seats.put("A1", 1);
		seats.put("A2", 0);
		seats.put("A3", 0);
		seats.put("A4", 0);
		seats.put("A5", 0);
		
		
		seats.put("B1", 0);
		seats.put("B2", 1);
		seats.put("B3", 0);
		seats.put("B4", 0);
		seats.put("B5", 0);
		
	}

}
