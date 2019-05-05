package Statics;

import java.util.ArrayList;

import utitlities.MyCollection;

public class LexusTest {
	public static void main(String[] args) {
		System.out.println(Lexus.totalLexus);
		//Printing initial state!
		Lexus l1 = new Lexus("Lexus RX 450", 2019);
		System.out.println(Lexus.totalLexus);
		System.out.println(Lexus.mileToKm(2));
		System.out.println(l1.mileage);
		l1.mileage = 45000;
		Lexus.evaluateCar(l1);
		
	    ArrayList <String> myWord = MyCollection.getStringList();
	    System.out.println(myWord);
		ArrayList<Integer>nums = MyCollection.getIntegerList();
		System.out.println(nums);
		
		ArrayList<String>newArr = new ArrayList<>();
		newArr.add("Cholpon");
		newArr.add("tea");
		newArr.add("bag");
		newArr.add("school");
		newArr = MyCollection.filterList(newArr, 7);
		System.out.println(newArr);
		
		
		ArrayList<String> unique = new ArrayList<>();
		unique.add("Cholpon");
		unique.add("Cholpon");
		unique.add("tea");
		unique.add("pen");
		unique.add("water");
		unique.add("water");
		unique = MyCollection.removeDuplicates(unique);
		System.out.println(unique);
		
		
	}

}
