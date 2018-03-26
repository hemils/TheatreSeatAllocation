package com.theatre.model;

import java.util.List;

public class Theatre {

	private List<SeatRows> rows;
	private int totalRows;
	
	public List<SeatRows> getRows() {
		return rows;
	}

	public void setRows(List<SeatRows> rows) {
		this.rows = rows;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	
	
}
