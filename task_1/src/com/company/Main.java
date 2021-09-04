package com.company;

public class Main {

    public static void main(String[] args) {
        Electric electricCar = new Electric("BMW");
        Electric electricCar2 = new Electric("BMW2");
        Hybrid hybridCar = new Hybrid("Toyota", "Red");
        Diesel dieselCar = new Diesel("Chevrolet");

        System.out.println(electricCar.getFuelType());
        System.out.println(hybridCar.getFuelType());
        System.out.println(dieselCar.getFuelType());
        System.out.println(Electric.getNoOfElectricCarsCreated());
    }
}
