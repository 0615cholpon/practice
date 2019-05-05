package ArrayList;

import Constructors.Item;

public class ShoppingCenter {
	public static void main(String[] args) {
		Store channel = new Store("Good Vibes", "Chicago, IL");
		//channel.seeInventory();
		Item screen = new Item ("Screen ABG", 35);
		Item bag = new Item("bag pack", 300);
		channel.addItem(bag);
		channel.addItem(screen);
		//channel.seeInventory();
		
		Item board = new Item ("white board", 10.0);
		
		
		channel.checkItem("bag pack");
		channel.checkItem("phone");
	
		channel.exchange(board, bag);
		System.out.println(channel.totalSales);
		//channel.seeInventory();
		
		channel.addItem(3);
		channel.seeInventory();
		
		
		
		
	}

}
