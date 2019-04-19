package VATasks;

public class reverseWhSubstringChar {
	public static void main(String[] args) {
		String word = "java";
		String reversed = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		System.out.println(reversed);
		
		for(int k = word.length() -1; k >= 0; k--) {
			reversed += word.substring(k, k + 1);
		}
		System.out.print(reversed);
	}

}
