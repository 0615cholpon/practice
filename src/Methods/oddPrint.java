package Methods;

import java.util.Scanner;

public class oddPrint {
	public static void main(String[] args) {
		
		oddPrint50();
		printName("Cholpon");
		odd10(40);
	}
	
	public static void oddPrint50() {
		for(int i = 0; i < 50; i++) {
			if(i % 2 ==1) {
				System.out.print(i + " ");
			}
		}
	}
	public static void printName(String name) {
		System.out.println();
		System.out.println("Welcome, " + name + "!");
	}
	public static void odd10(int limit) {
		for(int i = 0; i < limit; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	public static void reverseString(String Word) {
		int LastIndex = Word.length()-1;
		for(int i = LastIndex; LastIndex >= 0; i--) {
			LastIndex--;
			
		}
	}

}
