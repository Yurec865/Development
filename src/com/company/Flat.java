package com.company;

import java.util.ArrayList;

public class Flat {
    int apartmentNumber;
    ArrayList Room = new ArrayList();
    Flat(){
        Room.add(new Bathroom());
        Room.add(new Kitchen());
        Room.add(new Hallway());
    }


}
