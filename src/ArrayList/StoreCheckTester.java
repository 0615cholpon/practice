package ArrayList;

import Constructors.Item;

public class StoreCheckTester {
	public static void main(String[] args) {
		StoreCheck tester1 = new StoreCheck("Walmart", "1217 W.Touhy Ave.");
		Item book = new Item("OCA Book", 25.00);
		tester1.addItem(book);
		
		Item pencil = new Item("Sandals", 1.00);
		tester1.addItem(pencil);
		
		Item shoes = new Item("Clarks", 50.00);
		tester1.addItem(shoes);
		
		
		
	
				
	}

}
