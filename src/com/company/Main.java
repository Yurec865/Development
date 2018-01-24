package com.company;

public class Main {

    public static void main(String[] args) {
        MultiStoreyBuilding multiStoreyBuilding = new MultiStoreyBuilding();
        OrdinaryHouse ordinaryHouse = new OrdinaryHouse();
        multiStoreyBuilding.outputNumber();

        System.out.println("Square ordinaryHouse: " + ordinaryHouse.getSquare());
        System.out.println("Is ordinal ordinaryHouse: " + ordinaryHouse.isOrdinal());
        System.out.println("Square multiStoreyBuilding: " +multiStoreyBuilding.getSquare());
        System.out.println("Is ordinal multiStoreyBuilding: " +multiStoreyBuilding.isOrdinal());

    }
}
