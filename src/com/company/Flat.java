package com.company;

import java.util.ArrayList;

public class Flat {
    private int apartmentNumber;
    private ArrayList<Room> room = new ArrayList<>();
    Flat(){
        Bathroom bathroom = new Bathroom();
        bathroom.length = 10;
        bathroom.width = 20;
        bathroom.setBath("bath");
        bathroom.setToilet("toilet");
        bathroom.setWashbasin("was");
        room.add(bathroom);
//todo the same for other
        room.add(new Kitchen());
        room.add(new Hallway());
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public ArrayList<Room> getRooms() {
        return room;
    }

    public void setRoom(ArrayList room) {
        this.room = room;
    }
}
