package com.company;

public class Kitchen extends  Room {
    String microwaveOven;
    String fridge;
    String dishwasher;

    public String getMicrowaveOven() {
        return microwaveOven;
    }

    public void setMicrowaveOven(String microwaveOven) {
        this.microwaveOven = microwaveOven;
    }

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(String dishwasher) {
        this.dishwasher = dishwasher;
    }
}
