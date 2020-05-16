package com.company.creatures;

import com.company.Human;
import com.company.creatures.Animal;

public class Pet extends Animal {

    String species;
    public String name;
    private double weight;

    public Pet(String species) {
        super(species);
    }


}
