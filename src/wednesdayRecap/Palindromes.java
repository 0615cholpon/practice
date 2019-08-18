package wednesdayRecap;

public class Palindromes {
	public static void main(String[] args) {
		System.out.println(isPalindrome("civic"));
	}
	
	public static boolean isPalindrome(String word) {
		String palindrom = "";
		for(int i = word.length()-1; i >= 0; i--) {
			palindrom += word.charAt(i);
		}
		if(word.equals(palindrom)) {
			return true;
		}else {
			return false;
		}
	}

}
