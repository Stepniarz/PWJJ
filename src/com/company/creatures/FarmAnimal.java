package com.company.creatures;

import com.company.Human;

public class FarmAnimal extends Animal implements Edible {

    String species;
    public String name;
    private double weight;

    public FarmAnimal(String species) {
        super(species);
    }


    @Override
    public void beEaten() {
        System.out.println(this.toString() + " Got eaten.. RIP buddy");
        this.weight = 0.0;
    }
}



