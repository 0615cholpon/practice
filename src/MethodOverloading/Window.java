package MethodOverloading;

public class Window {
	public static void main(String[] args) {
		//printArray(1, 3, 6, 7, 89, 87);
		//welcome("Aigul");
	}
	public static void welcome(String name) {
		System.out.println("Welcome, " + name);
	}
	public static void printArray(int ... nums) { //instead of [] we're using ...
 		//is only for arrays and methods;
	// when we have two parameters: int n, int ... nums
		for(int i: nums) {
			System.out.println(i);
		}
		
	}

}
