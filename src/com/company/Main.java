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
	//console
		System.out.println("Hello "+me.firstName+", you have so many animals:");
		System.out.println(dog.name+", "+lion.name+", "+mouse.name);
		System.out.println("You need to take care of them. That means you need to walk and feed them");
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.takeForAWalk();
		dog.feed();
    }

}
