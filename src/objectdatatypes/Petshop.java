package objectdatatypes;

public class Petshop {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		// reference object -- object  Ask Gabriel!
// Dog --> is a class that holds all the rules for one Dog to have 
// dog1 --> is a representation of an actual object/dog;
// instance --> same as object;
// instantiate --> creating an object
// Whenever we r using keyword 'new' we are instantiating an object
		dog1.age = 3;
		System.out.println(dog1.age);
		// if we don't assign be default we get "0";
		dog1.color = "brown";
		System.out.println(dog1.color);
		// by default "null".
		dog1.bark(); // Simply calling that method
	}

}
