package dxc.basic.interfaceexample;

interface Pet
{
	public String cuddle();
	public void eat();
}

class Dog implements Pet  {

	public String cuddle() {
		return "Purring sounds";
	}

	public void eat() {
		System.out.println("Eating stereotypical bones");
		
	}
	
}

class Cat implements Pet  {
	
	public String cuddle() {
		return "Yawning sounds";
	}

	public void eat() {
		System.out.println("Eating stereotypical fish");
		
	}
}

interface Adoption
{
	void adoptPet(Pet pet);
}

class PetAdoptionCenter implements Adoption{
	
	public void adoptPet(Pet pet) {
		System.out.println("You have successfully adopted the pet from "
				+ "PetAdoptionCenter  and pet eats food :" + pet.cuddle());
		pet.eat();
	}
	
	 
	
	public static void main(String[] args) {
	    Pet pet = new Dog();
	    
	    Adoption  adopt = new PetAdoptionCenter();
	    
	    adopt.adoptPet(pet);
	    
	    pet = new Cat();
	    
	    adopt.adoptPet(pet);
	    
	   
	}
}

// Try taking out either one of the methods in the PetAdoptionCenter class and observe what will happen.
