package com.car;

public class Diesel extends Car{
    public Diesel(String Manufacturer){
        super();
        super.setManufacturer(Manufacturer);
    }

    public Diesel(String Manufacturer, String color){
        super();
        super.setManufacturer(Manufacturer);
        super.setColor(color);

    }

    @Override
    public void getFuelType() {
        System.out.println("The fuel type is: " + this.getClass().getSimpleName());
    }
}
