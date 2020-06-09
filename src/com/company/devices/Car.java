package com.company.devices;

import com.company.Human;
import com.company.creatures.Salleable;

public class Car extends Device implements Salleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
    if (seller.car == this && buyer.cash >= price)
    {
        seller.cash += price;
        seller.car = null;
        buyer.cash -= price;
        buyer.car = this;
        System.out.println(seller + "Just sold his car to " + buyer + "for just " + price + "!!!");
    }
    else
    {
        System.out.println("Someone here doesn't have money to buy what he/she deserves");
        System.out.println("OR");
        System.out.println("Someone doesn't posses the item he/she wishes to sell");
    }

    }

    //protected abstract void Refuel();
}
  

