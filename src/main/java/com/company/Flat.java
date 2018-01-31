package com.company;

import java.util.ArrayList;

public class Flat {
    private int apartmentNumber;
    private ArrayList<Room> room = new ArrayList<>();
    Flat(){
        Bathroom bathroom = new Bathroom();
        bathroom.length = 25;
        bathroom.width = 20;
        bathroom.setBath("bath");
        bathroom.setToilet("toilet");
        bathroom.setWashbasin("washbasin");
        room.add(bathroom);

        Kitchen kitchen = new Kitchen();
        kitchen.length = 5;
        kitchen.width = 10;
        kitchen.setDishwasher("dishwasher");
        kitchen.setFridge("fridge");
        kitchen.setMicrowaveOven("microwaveOven");
        room.add(kitchen);

        Hallway hallway = new Hallway();
        hallway.length = 30;
        hallway.width = 10;
        hallway.setSofa("sofa");
        hallway.setTable("table");
        hallway.setWardrobe("wardrobe");
        room.add(hallway);
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
