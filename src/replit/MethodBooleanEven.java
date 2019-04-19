package replit;

public class MethodBooleanEven {
	public static void main(String[] args) {
		boolean check = isEven(3);
		if(check) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
public static boolean isEven(int n) {
	if(n % 2 == 0) {
		return true;
	}else {
		return false;
	}
}
}
