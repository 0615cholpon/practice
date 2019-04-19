package replit;

public class Merge {
	public static void main(String[] args) {
		String name = mergeStrings("tea", "coffee");
		System.out.println(name);
	}
public static String mergeStrings(String one, String two) {
	String total = "";
	if(one.length() > two.length()) {
		for(int i = 0; i < two.length(); i++) {
			total += one.charAt(i) + "" +two.charAt(i);	
		}
		total += one.substring(two.length());
	}
	
	if(one.length() < two.length()) {
		for(int i = 0; i < one.length(); i++) {
			total += two.charAt(i) + "" +one.charAt(i);
		}
		total += two.substring(one.length());
	}
	return total;
}
}
