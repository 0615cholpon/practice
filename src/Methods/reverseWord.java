package Methods;

public class reverseWord {
	public static void main(String[] args) {
		reverseString("James");
	}
public static void reverseString(String name) {
	String revWord = "";
	int LastIndex = name.length()-1;
	for(int i = LastIndex; i >= 0; i--) {
		revWord += name.charAt(i);
	
	}
	System.out.println(revWord);
	
}
}
