package com.company.devices;

public abstract class Device {

    public abstract String producer();

    public abstract String model();

    public abstract Integer yearOfProduction();

    public String toString() {
        return "Device" +
                " produced by: " + producer() +
                ", model: " + model() +
                ", year of production" + yearOfProduction();
    }

    public abstract void turnOn();


}
