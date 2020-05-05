package com.company;

public class Car {
    public final String producer;
    public final String model;
    public final Double engine;
    public final boolean isElectric;
    public String plates;
    private double price;

    public Car(String producer, String model, Double engine, boolean isElectric) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        this.isElectric = isElectric;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car" +
                " produced by " + producer +
                ", model: " + model +
                ", engine: " + engine +
                ", isElectric: " + isElectric +
                ", plates: " + plates +
                ", price: " + price;

    }
}
  

