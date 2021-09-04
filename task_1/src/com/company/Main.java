package com.company;

public class Main {

    public static void main(String[] args) {
        Electric electricCar = new Electric("BMW");
        Hybrid hybridCar = new Hybrid("Toyota", "Red");
        Diesel dieselCar = new Diesel("Chevrolet");

        System.out.println(electricCar.getFuelType());
        System.out.println(hybridCar.getFuelType());
        System.out.println(dieselCar.getFuelType());
    }
}
