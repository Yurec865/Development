package com.company;

import java.util.ArrayList;

public class OrdinaryHouse implements House {

    private ArrayList<Room> room2 = new ArrayList<>();

    OrdinaryHouse(){
        Bathroom bathroom = new Bathroom();
        bathroom.length = 7;
        bathroom.width = 3;
        bathroom.setBath("bath");
        bathroom.setToilet("toilet");
        bathroom.setWashbasin("washbasin");
        room2.add(bathroom);

        Kitchen kitchen = new Kitchen();
        kitchen.length = 7;
        kitchen.width = 9;
        kitchen.setDishwasher("dishwasher");
        kitchen.setFridge("fridge");
        kitchen.setMicrowaveOven("microwaveOven");
        room2.add(kitchen);

        Hallway hallway = new Hallway();
        hallway.length = 15;
        hallway.width = 7;
        hallway.setSofa("sofa");
        hallway.setTable("table");
        hallway.setWardrobe("wardrobe");
        room2.add(hallway);

    }

    @Override
    public double getSquare() {
        int square = 0;
        for (Room room : room2) {
            square += room.area();
        }
		return square;
    }

    @Override
    public boolean isOrdinal() {
        return true;
    }

    public ArrayList<Room> getRoom2() {
        return room2;
    }

    public void setRoom2(ArrayList<Room> room2) {
        this.room2 = room2;
    }
}
