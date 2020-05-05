package com.company;

public class Human {
    String species;
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;
    private Double salary;


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
    public void setCar(Car car)
    {
        if(salary>=car.getPrice())
        {
            System.out.println("You managed to buy the car in cash! WOW");
            this.car = car;
        }
        else if(salary>car.getPrice()/12)
        {
            System.out.println("You had to take a loan for the car... better than nothing I guess");
            this.car = car;
        }
        else {
            System.out.println("You can't afford this car. Go to college or something and stop wasting my time");
        }
    }


   /*{ public Human(String species)

        this.species = species;
        if(species == "Matt")
    }*/
}
