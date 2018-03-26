package com.theatre.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.theatre.model.SeatRows;
import com.theatre.model.Section;
import com.theatre.model.Theatre;
import com.theatre.service.TheatreLayoutService;

public class TheatreServiceImpl implements TheatreLayoutService {
	
	public TheatreServiceImpl() {
		
	}

	@Override
	public Theatre buildTheatreLayout() {
		Theatre theatre = new Theatre();
		int totalRows = new Random().nextInt(15);
		theatre.setTotalRows(totalRows);
		List<SeatRows> seatRowsList = new ArrayList<>();
		for (int i = 1; i <= totalRows; i++) {
			SeatRows rowSeat = new SeatRows();
			rowSeat.setRowNum(i);
			int sectionByRow = new Random().nextInt(6);
			int count = 1;
			List<Section> sectionList = new ArrayList<>();
			//rowSeat.setTotalSectionByRow(sectionByRow);
			for (int j = 1; j <= sectionByRow; j++) {
				Section section = new Section();
				section.setSectionId(j);
				int seatBySection = new Random().nextInt(5);
				section.setTotalSeatsBySection(seatBySection);
				section.setAvailableSeats(seatBySection);
				section.setBookedSeatCount(0);
				section.setSectionBooked(false);
				sectionList.add(section);
				rowSeat.setSeatNum(count);
				count++;
			}
			rowSeat.setMaxSeatCountByRow(count);
			rowSeat.setSectionList(sectionList);
			seatRowsList.add(rowSeat);
		}
		theatre.setRows(seatRowsList);
		System.out.println("Theathre Total Rows" +theatre.getTotalRows());
		return theatre;
	}

}
