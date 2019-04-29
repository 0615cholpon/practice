package Constructors;

public class Speaker {
	
	String model;
	double weight;
	int year;
	
	public Speaker(String model) {
		this.model = model;
		this.year = 2000;
		this.volumeUp();
		 //this(model, 2000); //default = 0 or u need to assign it
	}
	// this() --> current constructor!
	public Speaker(String model, int year) {
		//this(model); // invoking from the public Speaker(String model);
		             // calling neighbor constructor!
		             // u can have only one of them!
		this.model = model;
		this.year = year;
		this.volumeUp();
	}
	
public void volumeUp() {
	System.out.println(model + " is increasing the volume " + year);
}
public void volumeDown() {
	System.out.println(model + " is decreasing the volume " + this.year);
}
}
