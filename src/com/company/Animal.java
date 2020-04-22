package com.company;
import java.io.File;

public class Animal {
    final String species;
    String name;
    private Double weight = 10.0;
    File pic;
    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species)
    {
        this.species = species;
        if(species == "dog")
            this.weight = DEFAULT_DOG_WEIGHT;
        if(species == "lion")
            this.weight = DEFAULT_LION_WEIGHT;
        if(species == "mouse")
            this.weight = DEFAULT_MOUSE_WEIGHT;
    }
}
