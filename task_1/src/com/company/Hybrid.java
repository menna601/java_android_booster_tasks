package com.company;

public class Hybrid extends Car{
    private static int noOfHybridCarsCreated;
    Hybrid(String Manufacturer){
        super.setManufacturer(Manufacturer);
        super.setFuelType("Electric or Gasoline");
        noOfHybridCarsCreated++;
    }

    Hybrid(String Manufacturer, String color){
        super.setManufacturer(Manufacturer);
        super.setColor(color);
        super.setFuelType("Electric or Gasoline");
        noOfHybridCarsCreated++;
    }

    public static int getNoOfHybridCarsCreated(){
        return noOfHybridCarsCreated;
    }

    @Override
    public String getFuelType() {
        return "The fuel type is: " + super.getFuelType();
    }
}
