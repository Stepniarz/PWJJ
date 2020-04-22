package com.company;

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

    }
}
