package replit;

public class limitString {
	public static void main(String[] args) {
		String str = limit("hello", 3);
		System.out.println(str);
	}
public static String limit(String text, int maxLength) {
	
	
	String total = text.substring(0, maxLength);
	return total;
	
	
}

}
