package com.company;

public class Hybrid extends Car{
    Hybrid(String Manufacturer){
        super.setManufacturer(Manufacturer);
        super.setFuelType("Electric or Gasoline");
    }

    Hybrid(String Manufacturer, String color){
        super.setManufacturer(Manufacturer);
        super.setColor(color);
        super.setFuelType("Electric or Gasoline");
    }

    @Override
    public String getFuelType() {
        return "The fuel type is: " + super.getFuelType();
    }
}
