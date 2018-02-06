package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Calculator{
    double x;
    double y;
    Calculator(){
      x = 10;
      y = 2;
        }
    ArrayList<History> histories = new ArrayList<>();

    public double multiply(){
        double result = this.x * this.y;
        return result;
        histories.add();
    }
    public double divide(){
        double result = this.x / this.y;
        return result;
        histories.add(new History();
    }
    public double ply(){
        double result = this.x + this.y;
        return result;
        histories.add(new History();
    }
    public double deduct(){
        double result = this.x - this.y;
        return result;
        histories.add(new History();
    }
    public ArrayList<History> getHistories() {
        return histories;
    }
}