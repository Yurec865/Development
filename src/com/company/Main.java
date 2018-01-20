package com.company;

public class Main {

    public static void main(String[] args) {
        MultiStoreyBilding multiStoreyBilding = new MultiStoreyBilding();

        System.out.println("musddsfds" +multiStoreyBilding.getSquare());
    }
    //todo separate class
    public interface House{
        double getSquare();
        boolean isOrdinal();
    }
}
