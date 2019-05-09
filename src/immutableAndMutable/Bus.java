package immutableAndMutable;

import Constructors.Item;

public class Bus {
	public static void main(String[] args) {
		Item item = new Item("Pen", 12);
		Item item2 = new Item("Computer", 365); // Implicitly casting!
		System.out.println(item);
		System.out.println(item2);
		item = item2;
		System.out.println(item);
		System.out.println(item2);
		
//	Post p1 = new Post("Welcome!");
//	p1.info();
//	Post  p2 = p1;
//	p2.info();
//	
//	p1.setLikes(34);
//	p1.info();
//	p2.info();
//	System.out.println(p1);
//	System.out.println(p2);
}
	

}
