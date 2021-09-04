package com.company;

public class Diesel extends Car{
    Diesel(String Manufacturer){
        super.setManufacturer(Manufacturer);
        super.setFuelType("Diesel");
    }

    Diesel(String Manufacturer, String color){
        super.setManufacturer(Manufacturer);
        super.setColor(color);
        super.setFuelType("Diesel");
    }

    @Override
    public String getFuelType() {
        return "The fuel type is: " + super.getFuelType();
    }
}
