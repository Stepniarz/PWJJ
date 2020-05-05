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

		Car VolvoS40 = new Car ("Volvo","s40",1.6,false);
		VolvoS40.plates = "GD33333";
		VolvoS40.setPrice(8000.0);
		me.setCar(VolvoS40);

		Phone iPhone = new Phone("Apple","SE",4.4,false);
	//console
		System.out.println(me.getCar());
		System.out.println(dog);
		System.out.println(iPhone);
		System.out.println(me);
		/*
		System.out.println("Hello "+me.firstName+", you have so many animals:");
		System.out.println(dog.name+", "+lion.name+", "+mouse.name);
		System.out.println("You need to take care of them. That means you need to walk and feed them");
		System.out.println(me.car.plates);
		System.out.println("My salary is: "+me.getSalary());
		*/
	//Zad 5

    }

}
