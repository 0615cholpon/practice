package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import Constructors.Item;

public class Store {
	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	double totalSales;
	int costOfInventory;
	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void addItem(Item object) {
		storeItems.add(object);
		numOfItems ++;
		
	}
	public void addItem(int numOfItemsToAdd) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < numOfItemsToAdd; i++) {
			System.out.println("Please enter item name " + (i + 1) + ":");
			String itemName = input.nextLine();
			System.out.println("Please enter item price " + (i + 1) + ":");
			double itemPrice = input.nextDouble();
			input.nextLine();
			Item book = new Item(itemName, itemPrice);
			storeItems.add(book);
			numOfItems ++;
			costOfInventory += storeItems.get(i).price;
			
		
		}
		System.out.println("Number of items " + numOfItems);
		System.out.println("Total cost of items " + costOfInventory);
		
		
	
	}

	
	public void sell(String itemName) {
		for(int i = 0; i < storeItems.size(); i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " sold for " + storeItems.get(i).price);
				numOfItems--;
				totalSales += storeItems.get(i).price;
				storeItems.remove(i);
				 break;
			}
			}
		}
	public void refund(Item object) {
		System.out.println("Refund Transaction has been completed!");
		addItem(object);
		totalSales -= object.price;
		
	}
	public boolean checkItem(String itemName) {
		for(int i = 0; i < storeItems.size(); i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is in stock");
				return true;
			}
		}
		System.out.println(itemName + " isn't in stock");
		return false;
		// FOR EACH LOOP
		// for(Item item: storeItem){
		// if(item.name.equals(itemName))
//			return true;}
	}
	public void exchange(Item toReturn, Item toGet) {
		System.out.println(toReturn.name + " is being changed with " + toGet.name);
		storeItems.add(toReturn); // to return;
		storeItems.remove(toGet); // buying a new one;
		totalSales += toGet.price - toReturn.price;
		
		
	}
	public void seeInventory() {
		System.out.println("Our inventory list: ");
		
		for(Item itemTotal: storeItems) {
			itemTotal.info();
			System.out.println();
		}
	
		
	}
	

		
	}


