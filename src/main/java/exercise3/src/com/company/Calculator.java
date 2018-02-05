package com.company;


import java.util.ArrayList;

public class Calculator{
    Calculator(){
        double x = 12;
        double y = 7;
        }
    ArrayList<History> histories = new ArrayList<>();
    public double multiply(double x, double y){
        double result = x*y;
        System.out.println(result);
        histories.add(new History());
        return 0;
    }
    public double divide(){
        histories.add(new History());
        return 0;
    }
    public double ply(){
        histories.add(new History());
        return 0;
    }
    public double deduct(){
        histories.add(new History());
        return 0;
    }
}