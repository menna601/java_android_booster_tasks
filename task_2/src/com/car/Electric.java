package com.car;

public class Electric extends Car {
    public Electric(String Manufacturer) {
        super();
        super.setManufacturer(Manufacturer);
    }

    public Electric(String Manufacturer, String color) {
        super();
        super.setManufacturer(Manufacturer);
        super.setColor(color);
    }

    @Override
    public void getFuelType() {
        System.out.println("The fuel type is: " + this.getClass().getSimpleName());
    }
}
