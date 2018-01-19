package com.company;

import java.util.ArrayList;

public class OrdinaryHouse implements Main.House {
    ArrayList Flat = new ArrayList();
    OrdinaryHouse(){
        Flat.add(1);
        Flat.add(2);
        Flat.add(3);
        Flat.add(4);
        Flat.add(5);
    }
    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public boolean isOrdinal() {
        return true;
    }
}
