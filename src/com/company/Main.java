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
		Human me = new Human("Homo sapiens");
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



		Human Gruby = new Human("Homo sapiens");
		Gruby.firstName = "Gruby";
		Gruby.lastName = "Kolega";
		Gruby.pet = lion;
		Gruby.setSalary(3000.0);
		Gruby.cash = 12000.0;

		//Tablica for fun
		String[] names = {"Mateusz", "Marcin", "Paweł"};

		String[] names2 = new String[3]; //tworzenie tablicy o rozmiarze który chcemy
		names[0] = "Mateusz";
		names[1] = "Marcin";
		names[2] = "Paweł";
		Integer[] numbers = {1, 2, 3,};

		for(String name : names) {
		System.out.println(name);

			//Farm
			me.farm[0] = new FarmAnimal("cow");
			me.farm[1] = new FarmAnimal("pig");
			me.farm[2] = new FarmAnimal("chicken");
			me.farm[3] = new FarmAnimal("chicken");

			for (int i = 0; i < me.farm.length; i++){
				System.out.println(me.farm[i]);
			}



		}

		//Devices
		Phone iPhone = new Phone("Apple","SE",4.4,false,2015);
		me.phone = iPhone;
		Car volvoS40 = new Car("Volvo","S40",1.6,false,2005);
		Car opelAstra = new Car("Opel", "Astra",1.6,false,2005);
		me.car = opelAstra;
		me.car = volvoS40;

		//Console
		me.phone.installAnApp("Instagram");
		me.phone.installAnApp("Facebook",1.2);
		me.phone.installAnApp("Pokemon Go",9.0,"abc");
		}

    }


