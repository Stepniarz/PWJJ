package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {


	public static void main(String[] args)
    {
		Animal dog = new Animal("dog");
		dog.name = "Diego";
		Animal lion = new Animal("lion");
		lion.name = "Simba";
		Animal mouse = new Animal("mouse");
		mouse.name = "Mickey";
		Human me = new Human();
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

		Car VolvoS40 = new Car ("Volvo","s40",1.6,false,2015);
		VolvoS40.plates = "GD33333";
		VolvoS40.setPrice(8000.0);
		me.setCar(VolvoS40);
		Car OpelAstra = new Car("Opel","Astra",1.6,false, 2015);
		OpelAstra.setPrice(8000.0);
		Car OpelAstra1 = new Car("Opel","Astra",1.6,false,2015);
		OpelAstra.setPrice(8000.0);
		Phone iPhone = new Phone("Apple","SE",4.4,false,2015);


	//console
		iPhone.turnOn();
		VolvoS40.turnOn();
		VolvoS40.sell(me, Gruby,6000.0);
		lion.sell(Gruby, me, 2000.0);
		iPhone.sell(me, Gruby, 1000.0);

		/*
		System.out.println(me.getCar());
		System.out.println(dog);
		System.out.println(iPhone);
		System.out.println(me);
		System.out.println(VolvoS40.getPrice().equals(OpelAstra.getPrice()));
		System.out.println(OpelAstra1.getPrice().equals(OpelAstra.getPrice()));
		System.out.println();
		System.out.println("Hello "+me.firstName+", you have so many animals:");
		System.out.println(dog.name+", "+lion.name+", "+mouse.name);
		System.out.println("You need to take care of them. That means you need to walk and feed them");
		System.out.println("My salary is: "+me.getSalary());
		*/
	//Zad 5

    }

}
