package Abstractions;

public abstract class Phone {
	// Class Phone can have abstract methods
	// Regular classes can't have abstract methods
	String model;
	int size;

	public abstract void call();
	public abstract void internetConnection();
	
	public void info() {
		System.out.println("Model: " + model);
		System.out.println("Size: " + size);
	}

}
