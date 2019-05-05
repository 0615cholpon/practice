package utitlities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
	static Scanner input= new Scanner(System.in);
	public static ArrayList<String> getStringList() {
		ArrayList<String> str = new ArrayList<>();
		String answer;
		
		do {	
			System.out.println("Please enter String: ");
			String strW = input.nextLine();
			str.add(strW);
			System.out.println("Do you want to enter more? Y/N");
			answer = input.nextLine();

		}while(answer.equalsIgnoreCase("y"));
		System.out.println("Your list of string is returned.");
			return str;
	
		
	}
	public static ArrayList<Integer>getIntegerList(){
		ArrayList<Integer>nums = new ArrayList<>();
		String number;
		do {	
			System.out.println("Please enter number: ");
			int strW = input.nextInt();
			input.nextLine();
			nums.add(strW);
			System.out.println("Do you want to enter more? Y/N");
			number = input.nextLine();
	

		}while(number.equalsIgnoreCase("y"));
		System.out.println("Your list of string is returned.");
			return nums;
	}
	public static ArrayList<String> filterList(ArrayList<String> arrList, int length){
		ArrayList<String>newArr = new ArrayList<>();
		for(int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i).length() == length) {
			newArr.add(arrList.get(i));
			}
		}
		return newArr;
	}
	public static  ArrayList<String> removeDuplicates(ArrayList<String> word){
		ArrayList<String> unique = new ArrayList<>();
		for(int i = 0; i < word.size(); i++) {
			if(unique.contains(word.get(i))) {
				continue;

			}else {
				unique.add(word.get(i));
			}
		}
		return unique;
		
	}
	


}
