package com.car;

public abstract class Car {
    private static int noOfCarObjectCreated;
    private String color;
    private String Manufacturer;

    Car(){
        noOfCarObjectCreated++;
    }

    public static int getNoOfCarObjectCreated(){
        return noOfCarObjectCreated;
    }

    public abstract void getFuelType();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
