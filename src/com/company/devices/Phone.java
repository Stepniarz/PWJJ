package com.company.devices;

public class Phone extends Device {
    public final String producer;
    public final String model;
    public final Double screenSize;
    public final boolean isAndroid;
    public final Integer yearOfProduction;

    public Phone(String producer, String model, Double screenSize, boolean isAndroid, Integer yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Phone" +
                " produced by'" + producer +
                ", model:" + model +
                ", screenSize:" + screenSize +
                ", isAndroid:" + isAndroid +
                "yearOfProduction: " + yearOfProduction;
    }

    @Override
    public String producer() {
        return null;
    }

    @Override
    public String model() {
        return null;
    }

    @Override
    public Integer yearOfProduction() {
        return null;
    }

    @Override
    public void turnOn() {
        System.out.println("BEEP BEEP, READY TO USE CHIEF");
    }
}
