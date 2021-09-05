package com.main;
import com.car.*;
import com.shape.Circle;
import com.shape.Shape;
import com.shape.Square;

class Main {

    public static void main(String[] args) {
        Car[] cars = {
                new Diesel("BMW"), new Diesel("Toyota", "Red"),
                new Electric("Chevrolet"), new Electric("Jaguar", "Blue"),
                new Hybrid("BMW"), new Hybrid("Toyota", "Red"),
        };

        for (Car car : cars) {
            car.getFuelType();
        }

        System.out.println();
        System.out.println("Number of created objects of class Car = " + Car.getNoOfCarObjectCreated());
        System.out.println("-----------------------------------------------------");

        Shape[] shapes = {
                new Square(5), new Circle(10),
                new Square(3), new Circle(7),
                new Square(14), new Circle(30),
        };

        for(Shape shape : shapes){
            System.out.println("I am a " + shape.getShapeName() + " with area = " + shape.getArea());
        }
    }
}