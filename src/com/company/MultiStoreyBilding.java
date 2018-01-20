package com.company;

import java.util.ArrayList;

public class MultiStoreyBilding implements Main.House {
	ArrayList<Flat> flats = new ArrayList<>();

	MultiStoreyBilding() {
		Flat flat1 = new Flat();
		flat1.setApartmentNumber(1);

		Flat flat2 = new Flat();
		flat2.setApartmentNumber(2);

//        flats.add(1);
//        flats.add(2);
//        flats.add(3);
//        flats.add(4);
//        flats.add(5);
//        flats.add(6);
//        flats.add(7);
//        flats.add(9);
	}

	@Override
	public double getSquare() {
		int square = 0;
		for (Flat flat : flats) {
			ArrayList<Room> rooms = flat.getRooms();
			for (Room room : rooms) {
				square = +room.area();
			}
		}
		return square;
	}

	@Override
	public boolean isOrdinal() {
		return false;

	}
}
