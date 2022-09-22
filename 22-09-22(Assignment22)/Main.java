package demo;

public class Main {
	public static void main (String args[]){
		// creating an object of the sub-class

		Dog d = new Dog();
		// access field of super class 

		d.name="Tomy";

		d.display();
		// called method of super class using object of sub-class

		d.eat();
		 
		   }
}
