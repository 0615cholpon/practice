package Constructors;

import java.util.Scanner;

public class ItemTest {
	public static void main(String[] args) {
		//Item it1 = new Item("Shoes", 50.0);
		//it1.info();
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many items you want to add: ");
		int itemNum = input.nextInt();
		input.nextLine();
		
	Item [] myItems = new Item[itemNum];
		
		
		
		for(int i = 0; i < itemNum; i++) {
			System.out.println("Please enter name for item " + (i + 1) + ":");
			String nameItem = input.nextLine();
			System.out.println("Please enter  price for item " + (i + 1) + ":");
			double priceItem = input.nextDouble();
			input.nextLine();
			Item item = new Item(nameItem, priceItem);
			myItems[i] = item;
			
		}
		
		for(Item i: myItems) {
			i.info();
		}
	}

}
