package MethodOverloading;

public class Keys {
	public static void main(String[] args) {
		//calculate(45);
	// to make it short OR 
		short b = 45;
		calculate(b);
		//calculate((short)45);
		
	}
	public static void calculate(short s) {
		System.out.println("Short is calculating " + s);
	}
	public static void calculate(int i) {
		System.out.println("Int is calculating " + i) ;
	}

}
