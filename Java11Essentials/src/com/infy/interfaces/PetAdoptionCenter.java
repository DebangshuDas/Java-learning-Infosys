package com.infy.interfaces;

interface Pet {
	public String cuddle();
	public void eat();
}

class Dog implements Pet {

	public String cuddle() {
		return "Purring sounds";
	}

	public void eat() {
		System.out.println("Eating stereotypical bones");
		
	}
	
}

class Cat implements Pet {
	
	public String cuddle() {
		return "Yawning sounds";
	}

	public void eat() {
		System.out.println("Eating stereotypical fish");
		
	}
}

class PetAdoptionCenter {
	public static void adoptPet(Pet pet) {
		System.out.println("You have successfully adopted the pet.");
	}
	
	public static void main(String[] args) {
	    Dog dog1 = new Dog();
	    adoptPet(dog1);
	    
	    Cat cat1 = new Cat();
	    adoptPet(cat1);
	}
}
// Try to remove the connection between Cat and Pet and observe what happens
// Try doing the same with Dog and Pet, and observe what happens.
