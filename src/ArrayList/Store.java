package ArrayList;

import java.util.ArrayList;

import Constructors.Item;

public class Store {
	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void addItem(Item object) {
		storeItems.add(object);
		numOfItems ++;
		
	}
	public void seeInventory() {
		
		for(Item itemTotal: storeItems) {
			itemTotal.info();
			System.out.println();
		}
	
		
	}
	

}
