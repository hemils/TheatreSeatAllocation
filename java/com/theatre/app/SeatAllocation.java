package com.theatre.app;

import java.util.List;

import com.theatre.model.SeatRows;
import com.theatre.model.Section;
import com.theatre.model.Theatre;
import com.theatre.service.impl.TheatreServiceImpl;

public class SeatAllocation {

	public static void main (String args[]) {
		if (args.length <= 0) {
			throw new IllegalArgumentException("Seat Allocation Input is null. No Seat allocation possible with empty requests");
		}
		TheatreServiceImpl theatreService = new TheatreServiceImpl();
		Theatre theatreLayout = theatreService.buildTheatreLayout();
		
		SeatAllocation allocateSeats = new SeatAllocation();
		allocateSeats.performSeatAllocation(args, theatreLayout);
		
	}
	private void performSeatAllocation(String[] args, Theatre theatreLayout) {
		List<SeatRows> rows = theatreLayout.getRows();
			
		for (String seatRequest : args) {
			String name = seatRequest.substring(0, seatRequest.indexOf(":")+1);
			int totalTicket = Integer.parseInt(seatRequest.substring(seatRequest.indexOf(":")+1, seatRequest.length()));
			
			for(SeatRows rowSeat : rows ) {
				List<Section> sectionList = rowSeat.getSectionList();
				int totalSeatsByRow = rowSeat.getMaxSeatCountByRow();
				if (totalTicket > totalSeatsByRow) {
					System.out.println(name +" Sorry, we can't handle your party.");
					break;
				}
				if (totalTicket >= totalSeatsByRow) {
					System.out.println(name +" call to split party");
					break;
				}
				sectionList.stream().filter(section -> section.isSectionBooked()).forEach(rowSection -> {
					if (totalTicket <= rowSection.getTotalSeatsBySection()) 
					{
						rowSection.setBookedSeatCount(totalTicket);
						if (totalTicket == rowSection.getTotalSeatsBySection()) 
						{
							rowSection.setSectionBooked(true);
						}
						System.out.println(name +" Row " +rowSeat.getRowNum() +" Section " +rowSection.getSectionId());
					}
					else 
					{
						System.out.println(name +" call to split party");
						
					}
				});
			}
		}
		
		
	}
}
	
