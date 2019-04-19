package Methods;

public class Computer {
	public static void main(String[] args) {
		int m = getMemory();
		System.out.println(m);
	}
	public static int getMemory() {
		System.out.println("Returning the comp memory");
		return 516; //should return whatever value that int can carry!
	}
	
}
