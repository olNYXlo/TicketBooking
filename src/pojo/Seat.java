package pojo;

public class Seat {

	private String name;
	private String Selection;
	private int occupied;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSelection() {
		return Selection;
	}
	public void setSelection(String selection) {
		Selection = selection;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
	
	public Seat(String seatNo) {
		name = seatNo;
	}
}
