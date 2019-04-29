package Constructors;

public class Item {
String name;
double price;

public Item(String name, double price) {
	this.name = name;
	this.price = price;

}
public void info() {
	System.out.println("Item Information:");
	
	System.out.println("Name: " + this.name); // we can use without this too!
	System.out.println("Price: " + "$" + price);
	
} 
}
