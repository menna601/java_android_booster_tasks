package com.car;

public class Hybrid extends Car{
    public Hybrid(String Manufacturer){
        super();
        super.setManufacturer(Manufacturer);
    }

    public Hybrid(String Manufacturer, String color){
        super();
        super.setManufacturer(Manufacturer);
        super.setColor(color);
    }

    @Override
    public void getFuelType() {
        System.out.println("The fuel type is: " + this.getClass().getSimpleName()+" [Electric/Gasoline]");
    }
}
