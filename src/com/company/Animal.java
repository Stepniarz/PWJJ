package com.company;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.File;

public class Animal implements Salleable{
    final String species;
    String name;
    private Double weight = 10.0;
    File pic;
    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        if (species == "dog")
            this.weight = DEFAULT_DOG_WEIGHT;
        if (species == "lion")
            this.weight = DEFAULT_LION_WEIGHT;
        if (species == "mouse")
            this.weight = DEFAULT_MOUSE_WEIGHT;
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("IT TRUSTED YOU AND YOU KILLED IT");
        } else {
            weight++;
            System.out.println("Thx for food! Now I weight " + weight);
        }

    }

    void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("911 SOMEONE IS DRAGGING A DEAD ANIMAL ON THE SIDEWALK");
        } else {
            weight--;
            System.out.println("Thanks for taking me for a walk! Now I weight" + weight);
        }
    }

    @Override
    public String toString() {
        return "Animal's" +
                " species: " + species +
                ", name: " + name +
                ", weight: " + weight;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
            if(seller.pet == this && buyer.cash >= price)
            {
                seller.cash += price;
                seller.pet = null;
                buyer.cash -= price;
                buyer.pet = this;
                System.out.println(seller + " Just sold his pet to " + buyer + " for just "+ price);
            }
            else
            {
                System.out.println("Someone one here is lying about their savings or possessing a certain pet");
            }

    }
}

