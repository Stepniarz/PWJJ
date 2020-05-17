package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Double engine, boolean isElectric, Integer yearOfProduction) {
        super(producer, model, engine, isElectric, yearOfProduction);
    }

    @Override
    void Refuel() {
        System.out.println("Refueled with an USB cable");
    }
}
