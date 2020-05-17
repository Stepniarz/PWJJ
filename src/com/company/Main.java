package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {


	public static void main(String[] args)
    {
    	//Creatures
		Pet dog = new Pet("dog");
		dog.name = "Diego";
		Animal lion = new FarmAnimal("lion");
		lion.name = "Simba";
		Pet hamster = new Pet("mouse");
		hamster.name = "Dudek";
		Human me = new Human();
		FarmAnimal pig = new FarmAnimal("pig");
		pig.name = "Michalina";
		FarmAnimal cow = new FarmAnimal("cow");
		cow.name = "Mućka";

		//Humans
		me.firstName = "Mateusz";
		me.lastName = "Stępiński";
		me.pet = dog;
		me.setSalary(4000.0);
		me.cash = 15000.0;


		Human Gruby = new Human();
		Gruby.firstName = "Gruby";
		Gruby.lastName = "Kolega";
		Gruby.pet = lion;
		Gruby.setSalary(3000.0);
		Gruby.cash = 12000.0;

		//Devices
		Phone iPhone = new Phone("Apple","SE",4.4,false,2015);
		me.phone = iPhone;
		//Console
		me.phone.installAnApp("Instagram");
		me.phone.installAnApp("Facebook",1.2);
		me.phone.installAnApp("Pokemon Go",9.0,"abc");
		}

    }


