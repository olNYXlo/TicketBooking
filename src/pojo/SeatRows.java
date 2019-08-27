package pojo;

import java.util.LinkedHashMap;
import java.util.List;

public class SeatRows {

	private String name;
	private String Selection;
	private LinkedHashMap<String, Seat> Row = new LinkedHashMap<String, Seat>();

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

	public LinkedHashMap<String, Seat> getRow() {
		return Row;
	}

	public void setRow(LinkedHashMap<String, Seat> row) {
		Row = row;
	}

	public SeatRows(String rowName) {
		for (int i = 1; i < 5; i++) {
			Seat newSeat = new Seat(rowName + i);
			if (i%2==0) {
				newSeat.setOccupied(0);
			}
			else {
				newSeat.setOccupied(1);
			}
			
			Row.put(rowName, newSeat);
		}

	}

}
