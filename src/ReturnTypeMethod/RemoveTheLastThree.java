package ReturnTypeMethod;

public class RemoveTheLastThree {
public static void main(String[] args) {
	String c = "consequence";
	System.out.println(lastThree(c, "con"));
	
}

public static String lastThree(String word, String remove) {
	word = word.toLowerCase().trim();
	
	if(word.contains(" ") || word.length() < 3) {
		System.out.println("Invalid data");
		return "";
	}
	if(word.contains(remove)) {
		return word.replace(remove, "");
	}
	
	return word;
}
}