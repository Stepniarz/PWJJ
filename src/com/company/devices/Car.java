package com.company.devices;

public class Car extends Device{
    public final String producer;
    public final String model;
    public final Double engine;
    public final boolean isElectric;
    public String plates;
    private double price;
    public Integer yearOfProduction;

    public Car(String producer, String model, Double engine, boolean isElectric,Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        this.isElectric = isElectric;
        this.yearOfProduction = yearOfProduction;
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
                ", price: " + price +
                ", yearOfProduction: " + yearOfProduction;

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
        System.out.println("BRRRR, WHERE ARE WE GOING CHIEF?");
    }
}
  

