package com.sachin.inheritance8.covarient;

class Animal {
	Animal getAnimal() {
		return new Animal();
	}
}

class Dog extends Animal {
	@Override
	Dog getAnimal() {
		return new Dog();
	}

	void bark() {
		System.out.println("Dog is Barking");
	}
}

public class Driver2 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Animal result = animal.getAnimal();

		Dog dog = (Dog) result;
		dog.bark();

	}

}
