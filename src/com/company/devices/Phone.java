package com.company.devices;

public class Phone {
    public final String producer;
    public final String model;
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, boolean isAndroid)
    {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    @Override
    public String toString() {
        return "Phone" +
                " produced by:'" + producer +
                ", model:'" + model +
                ", screenSize:" + screenSize +
                ", isAndroid:" + isAndroid;
    }
}
