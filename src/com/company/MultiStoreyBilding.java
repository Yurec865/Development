package com.company;

import java.util.ArrayList;

public class MultiStoreyBilding implements Main.House {
    ArrayList Flat = new ArrayList();
    MultiStoreyBilding(){
        Flat.add(1);
        Flat.add(2);
        Flat.add(3);
        Flat.add(4);
        Flat.add(5);
        Flat.add(6);
        Flat.add(7);
        Flat.add(9);
    }
    @Override
    public double getSquare() {
        for (int i = 0; i < Flat.size(); i++)  {
            System.out.println(i);
        }
        return 0;
    }

    @Override
    public boolean isOrdinal() {
        return false;

    }
}
