package com.company;

import java.util.ArrayList;

public class MultiStoreyBuilding implements House {
	private ArrayList<Flat> flats = new ArrayList<>();

	MultiStoreyBuilding() {
		Flat flat1 = new Flat();
		flat1.setApartmentNumber(1);
		flats.add(flat1);

		Flat flat2 = new Flat();
		flat2.setApartmentNumber(2);
		flats.add(flat2);

		Flat flat3 = new Flat();
		flat3.setApartmentNumber(3);
		flats.add(flat3);

		Flat flat4 = new Flat();
		flat4.setApartmentNumber(4);
		flats.add(flat4);

		Flat flat5 = new Flat();
		flat5.setApartmentNumber(5);
		flats.add(flat5);
	}
	public int outputNumber() {
		for(Flat flat : flats) {
			double square = getSquare();
			if (square > 40){
				System.out.println("Flat square > 40 : " + flat.getApartmentNumber());
			}
			}
		return 0;
	}
	@Override
	public double getSquare() {
		int square = 0;
		for (Flat flat : flats) {
			ArrayList<Room> rooms = flat.getRooms();
			for (Room room : rooms) {
				square = + room.area();
			}
		}
		return square;
	}
	@Override
	public boolean isOrdinal() {
		return false;

	}
	public ArrayList<Flat> getFlats() {
		return flats;
	}
	public void setFlats(ArrayList<Flat> flats) {
		this.flats = flats;
	}
}
