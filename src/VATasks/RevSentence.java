package VATasks;

public class RevSentence {
	public static void main(String[] args) {
		String str = "you love java";
		String revStr = "";
		String[] str1 = str.split(" ");
		for(int i = str1.length - 1; i >= 0; i--) {
			revStr += str1[i] + " ";
			
		}
		System.out.println(revStr);
		
	}

}
