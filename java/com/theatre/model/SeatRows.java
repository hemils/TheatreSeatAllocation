package com.theatre.model;

import java.util.List;

public class SeatRows {
	
	int rowNum;
	int seatNum;
	int maxSeatCountByRow;
	List<Section> sectionList;
	
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public List<Section> getSectionList() {
		return sectionList;
	}
	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}
	public int getMaxSeatCountByRow() {
		return maxSeatCountByRow;
	}
	public void setMaxSeatCountByRow(int maxSeatCountByRow) {
		this.maxSeatCountByRow = maxSeatCountByRow;
	}
	
	
}
