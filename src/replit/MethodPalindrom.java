package replit;

public class MethodPalindrom {
	public static void main(String[] args) {
		boolean test = isPalindrom("Nurses Run");
		if(test) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static boolean isPalindrom(String check) {
		String str = "".toLowerCase();
		for(int i = check.length() -1; i >= 0; i--) {
			char letter = check.charAt(i);
		    str += letter + "";
	}
		if(str.replace(" ", "").equalsIgnoreCase(check.replace(" ", ""))) {
			return true;
		} else {
			return false;
		}

}
}