package ReturnTypeMethod;

public class Calculator {
	public static void main(String[] args) {
	System.out.println(add(2,10));
	System.out.println(subtract(20,10));
	System.out.println(multiply(30, 2));
	System.out.println(division(10, 2));
// Write a method add that return integer and takes 2 integers
// Method should return sum of two integers
		
	}
	public static int add(int a, int b) {
		int total = a + b;
		return total;	
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b ) {
		return a * b;
	}
	public static int division(int a, int b) {
		return a/b;
	}

}
