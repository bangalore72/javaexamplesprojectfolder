package com.infy.batch2022.abhishekmalhotra;
 

interface Mammal {
	void run();
}

interface Cat extends Mammal {
	void eat();
}

 
class Animal implements Cat{

	public void run() {
		System.out.println("Pouncing around");
	}

	public void eat() {
		System.out.println("Too full to eat!");
	}

 
}

public class AnimalTester {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		//animal.run();
	}

}
