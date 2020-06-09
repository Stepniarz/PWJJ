package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public double cash;
    public Animal pet;
    String species;
    String firstName;
    String lastName;
    double weight;
    public Phone phone;
    public Car car;
    private Double salary;
    private static final int DEFAULT_GARAGE_SIZE = 2;
    private static final int DEFAULT_FARM_SIZE = 4;

    public Human(String species) {
        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[DEFAULT_FARM_SIZE];
        this.garage = new Car [DEFAULT_GARAGE_SIZE];
    }

    public FarmAnimal[] farm;
    public Car[] garage;

    public Human(Integer farmSize, Integer garageSize) {
        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[farmSize];
        this.garage = new Car[garageSize];
    }

    public Double getSalary()
    {
        System.out.println("New data has been sent to our accounting system");
        System.out.println("Hello, Miss Hania here :) I need you to come and take the annex to the contract");
        System.out.println("ZUS and US already know about your salary change. There is no purpose in hiding your income");
        return salary;
    }
    public void setSalary(Double salary)
    {
        if(salary<0)
            throw new IllegalArgumentException("You can't earn negative amounts of money dude");
        else if(salary>10000.0)
            throw new IllegalArgumentException("Dude you are a junior from WSB what did you expect?");
        this.salary = salary;
    }
    public Car getCar()
    {
        return this.car;
    }
    public void setCar(Car car,Integer index)
    {
        if(salary>=car.getPrice())
        {
            System.out.println("You managed to buy the car in cash! WOW");
            this.garage[index] = car;
        }
        else if(salary>car.getPrice()/12)
        {
            System.out.println("You had to take a loan for the car... better than nothing I guess");
            this.garage[index] = car;
        }
        else {
            System.out.println("You can't afford this car. Go to college or something and stop wasting my time");
        }
    }
    public double garageValue() {
        Double val = 0.0;
        for (Car car : garage) {
            if (car != null) {
                val += car.getPrice();
            }
        }
        return val;
    }

    @Override
    public String toString() {
        return "Human" +
                " firstName: " + firstName +
                ", lastName: " + lastName +
                ", pet: " + pet +
                ", phone: " + phone +
                ", car: " + car +
                ", salary: " + salary;
    }


    /*{ public Human(String species)

        this.species = species;
        if(species == "Matt")
    }*/

}
