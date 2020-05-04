package com.company;

public class Car {
    public final String producer;
    public final String model;
    public final Double engine;
    public final boolean isElectric;
    public String plates;

    public Car(String producer, String model, Double engine, boolean isElectric)
    {
     this.producer = producer;
     this.model = model;
     this.engine = engine;
     this.isElectric = isElectric;
    }
}