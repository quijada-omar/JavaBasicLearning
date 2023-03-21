package day11;

public class Animal {
	String color = "Animal:white";
	void eat() {
		System.out.println("Animal:Eating...");
	}

}

class Dog extends Animal
{	
	String color = "Dog:black";
	void eat() {
		System.out.println("Dog:Eating bread.");
		super.eat();
	}
	void displayColor() {
		System.out.println(super.color);
	}
}
