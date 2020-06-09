package com.company.devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, Double engine, boolean isElectric, Integer yearOfProduction) {
        super(producer, model, engine, isElectric, yearOfProduction);
    }

   /* @Override
    void Refuel() {
        System.out.println("Refuel complete");
    }*/
}
