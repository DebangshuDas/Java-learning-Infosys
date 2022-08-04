package com.infy.interfaces;

interface PetAnimal {
	void cuddle();
	void guardDuty();
}

interface ServiceAnimal {
	void helpCivilians();
	void guardDuty();
}

abstract class Animal {
	public abstract void eat();
}

class Doggy extends Animal implements PetAnimal, ServiceAnimal{

	@Override
	public void cuddle() {
		System.out.println("Trying to look cute for more cuddles!");
	}

	@Override
	public void helpCivilians() {
		System.out.println("Taking civilians to a nearby shelter.");
	}

	/*
	 * As you can see, there is one common function in both the interfaces,
	 * void guardDuty(). To implement it, we just Override the method in the Dog
	 * class.
	 */
	@Override
	public void guardDuty() {
		System.out.println("Guarding the perimeter.");
	}
	
	@Override
	public void eat() {
		System.out.println("Munching on treats.");
	} 
	
}
// Try to remove any of the Overriding functions from Dog class and observe what happens
