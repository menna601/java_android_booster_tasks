package com.company;

public class Diesel extends Car{
    private static int noOfDieselCarsCreated;
    Diesel(String Manufacturer){
        super.setManufacturer(Manufacturer);
        super.setFuelType("Diesel");

        noOfDieselCarsCreated++;
    }

    Diesel(String Manufacturer, String color){
        super.setManufacturer(Manufacturer);
        super.setColor(color);
        super.setFuelType("Diesel");

        noOfDieselCarsCreated++;
    }

    public static int getNoOfDieselCarsCreated(){
        return noOfDieselCarsCreated;
    }

    @Override
    public String getFuelType() {
        return "The fuel type is: " + super.getFuelType();
    }
}
