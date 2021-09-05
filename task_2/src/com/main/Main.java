package com.main;
import com.car.*;

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
        System.out.println(Car.getNoOfCarObjectCreated());
    }
}