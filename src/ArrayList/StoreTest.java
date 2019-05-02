package ArrayList;

import Constructors.Item;

public class StoreTest {
	public static void main(String[] args) {
		Store myStore = new Store("Barnes & Noble", "600, N. Michigan,Chicago IL");
		Item book1 = new Item("Gone with the Wind", 15.00);
		myStore.addItem(book1);
		Item mouse = new Item("Computer mouse", 4.00);
		myStore.addItem(mouse);
		Item pencil = new Item("Maxriter", 1.00);
		myStore.addItem(pencil);
		//myStore.seeInventory();
		//System.out.println("Total number of items: " + myStore.numOfItems);
		//System.out.println(myStore.storeItems); //shows the location of the ArrayList;
		myStore.seeInventory();
		
		myStore.sell("Maxriter");
		myStore.seeInventory();
		System.out.println(myStore.totalSales);
		
		myStore.refund(pencil);
		myStore.seeInventory();
		System.out.println("Number of items left " + myStore.numOfItems);
		
		
		
		
	
	}

}
