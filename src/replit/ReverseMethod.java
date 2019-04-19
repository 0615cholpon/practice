package replit;

public class ReverseMethod {
	public static void main(String[] args) {
		String check = reverse("Cholpon");
		System.out.println(check);
	}
	public static String reverse(String input) {
		String revWord = "";
		for(int i = input.length()-1; i >= 0; i--) {
			revWord += input.charAt(i);
		}
		return revWord;
	}

}
