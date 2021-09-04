package com.company;

public class Electric extends Car {
    private static int noOfElectricCarsCreated;
    Electric(String Manufacturer){
        super.setManufacturer(Manufacturer);
        super.setFuelType("Electric");

        noOfElectricCarsCreated++;
    }

    Electric(String Manufacturer, String color){
        super.setManufacturer(Manufacturer);
        super.setColor(color);
        super.setFuelType("Electric");

        noOfElectricCarsCreated++;
    }

    public static int getNoOfElectricCarsCreated(){
        return noOfElectricCarsCreated;
    }

    @Override
    public String getFuelType() {
        return ("The fuel type is: " + super.getFuelType());
    }
}


