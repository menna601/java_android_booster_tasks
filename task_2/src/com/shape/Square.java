package com.shape;

public class Square implements Shape{
    double length;
    public Square(double length){
        setLength(length);
    }
    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            System.out.println("Square length entered is negative value.. default = 0");
            return;
        }
        this.length = length;
    }

}
