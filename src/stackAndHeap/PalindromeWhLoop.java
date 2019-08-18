package stackAndHeap;

public class PalindromeWhLoop {
	public static void main(String[] args) {
	System.out.println(isPalindrome("mother"));
	System.out.println(isPalindrome("civic"));
	}
//	public static boolean isPalindrome(String word) {
//		StringBuilder check = new StringBuilder();
//		for(int i = word.length() -1; i >= 0; i--) {
//			check.append(word.charAt(i));
//		}
//		String charAandB = check.toString();
//		if(charAandB.equals(word)) {
//			return true;
//		}else {
//			return false;
//		}
//	}

	public static boolean isPalindrome(String word) {
		StringBuilder test = new StringBuilder(word);
		String revTest = test.reverse().toString();
		if(revTest.equals(word)) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
