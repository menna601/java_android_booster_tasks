package com.shape;

public class Circle implements Shape {
    double radius;

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            System.out.println("Circle radius entered is negative value.. default = 0");
            return;
        }
        this.radius = radius;
    }
}
