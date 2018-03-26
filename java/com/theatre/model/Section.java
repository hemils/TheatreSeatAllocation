package com.theatre.model;

public class Section {

	private int sectionId;
	private int totalSeatsBySection;
	private int bookedSeatCount;
	private boolean isSectionBooked;
	private int availableSeats;
	private int maxSectionSeat;
	
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public int getTotalSeatsBySection() {
		return totalSeatsBySection;
	}
	public void setTotalSeatsBySection(int totalSeatsBySection) {
		this.totalSeatsBySection = totalSeatsBySection;
	}
	public int getBookedSeatCount() {
		return bookedSeatCount;
	}
	public void setBookedSeatCount(int bookedSeatCount) {
		this.bookedSeatCount = bookedSeatCount;
	}
	public boolean isSectionBooked() {
		return isSectionBooked;
	}
	public void setSectionBooked(boolean isSectionBooked) {
		this.isSectionBooked = isSectionBooked;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = totalSeatsBySection - bookedSeatCount;
	}
	public int getMaxSectionSeat() {
		return maxSectionSeat;
	}
	public void setMaxSectionSeat(int maxSectionSeat) {
		this.maxSectionSeat = maxSectionSeat;
	}
	
	
	
	
}
