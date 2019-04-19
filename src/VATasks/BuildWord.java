package VATasks;

public class BuildWord {
	public static void main(String[] args) {
		String chars = "{{}}";
		String word = "java";
		String result = chars.substring(0, 2).concat(word)+ chars.substring(2);
		
		System.out.println(result);
	}

}
