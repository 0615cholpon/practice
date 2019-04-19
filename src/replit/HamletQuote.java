package replit;

public class HamletQuote {
	public static void main(String[] args) {
		boolean check = HamletQuote(false, false);
		if(check) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
public static boolean HamletQuote(boolean toBe, boolean notToBe) {
	
	if(toBe == false && notToBe ==false) {
		return false;
	}else {
		return true;
	}
	
	
	
}

}
