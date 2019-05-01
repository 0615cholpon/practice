package ArrayList;

import java.util.ArrayList;

import Constructors.Item;

public class StoreCheck {
	String name;
	String address;
	ArrayList<Item>myItems = new ArrayList<>();
	int numOfItems;
	public StoreCheck(String name, String address) {
		this.name = name;
		this.address = address;
		
	}
	public void addItem(Item object) {
		myItems.add(object);
		numOfItems ++;
	}
	public void seeInventory() {
		for(Item item: myItems) { // for each loop
			item.info();
			System.out.println();
		
		}
	}
	// for regular loop:
	// for(int i = 0; i < myItems; i++){
	// myItems.get(i).info() }
}
