package com.infy.batch2022.abhishekmalhotra.interfacetest;


interface Pet
{
	
	public String cuddle();

	public void eat();
	
}

class Dog  implements Pet{

	public String cuddle() {
		return "GRR sounds";
	}

	public void eat() {
		System.out.println("Eating stereotypical bones");
		
	}
	
}

class Cat implements Pet  {
	
	public String cuddle() {
		return "Meou sounds";
	}

	public void eat() {
		System.out.println("Eating stereotypical fish");
		
	}
}

class PetAdoptionCenter {
	
	public static void adoptPet(Pet pet) {
		System.out.println("You have successfully adopted the pet ." );
		System.out.println("Sound it makes " + pet.cuddle());
		pet.eat();
	}
	
	 
	public static void main(String[] args) {
		Pet dog = new Dog();
		
		 adoptPet(dog);
		
	    //Dog dog1 = new Dog();
	    //adoptPet(dog1);
	    
	   // Cat cat1 = new Cat();
	   // adoptPet(cat1);
		 
		 Pet cat1  = new Cat();
		 
		 adoptPet(cat1);
	}
}

