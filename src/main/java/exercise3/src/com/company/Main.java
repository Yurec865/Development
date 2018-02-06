package com.company;

public class Main {

    public static void main(String[] args) {
    Calculator calculator = new Calculator();
        System.out.println("Multiply : " + calculator.multiply());
        System.out.println("Divide : " + calculator.divide());
        System.out.println("Ply : " + calculator.ply());
        System.out.println("Deduct : " + calculator.deduct());
        System.out.println("ArrayList : " + calculator.getHistories());
    }
}
