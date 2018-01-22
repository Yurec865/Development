package com.company;

public class Bathroom extends Room {
    private String bath;
    private String toilet;
    private String washbasin;

    public String getBath() {

        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getWashbasin() {
        return washbasin;
    }

    public void setWashbasin(String washbasin) {
        this.washbasin = washbasin;
    }
}
