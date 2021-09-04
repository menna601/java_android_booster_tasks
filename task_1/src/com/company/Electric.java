package com.company;

public class Electric extends Car {
    Electric(String Manufacturer){
        super.setManufacturer(Manufacturer);
        super.setFuelType("Electric");
    }

    Electric(String Manufacturer, String color){
        super.setManufacturer(Manufacturer);
        super.setColor(color);
        super.setFuelType("Electric");
    }

    @Override
    public String getFuelType() {
        return ("The fuel type is: " + super.getFuelType());
    }
}


