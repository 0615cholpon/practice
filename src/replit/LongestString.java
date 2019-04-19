package replit;

public class LongestString {
	public static void main(String[] args) {
		String check = biggerS("Cholpon", "Chopa");
		System.out.println(check);
	}
public static String biggerS(String a ,String b) {
	
		if(a.length() > b.length()) {
			return a;
		}else {
			return b;
		}
	}
}


