package replit;

public class ThreeLocksBoolean {
	public static void main(String[] args) {
		boolean check = (threeLocks(true, false, false));
		if(check) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
public static boolean threeLocks(boolean a, boolean b, boolean c) {
	if(a == true && b == true || c == true) {
		return true;
	}
	return false;
}
}
