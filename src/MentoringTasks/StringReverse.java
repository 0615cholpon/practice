package MentoringTasks;

public class StringReverse {
	public static void main(String[] args) {
		String sentence = "Jave is fun";
		System.out.println(revW(sentence));
	
		
	}
	public static String revW (String sentence) {
		sentence = sentence.trim();
		String revStr = "";
		String []strSplit = sentence.split(" ");
		for(int i = 0; i < strSplit.length; i++) {
			revStr += reverse(sentence)+ " ";
		}
		return revStr;
	}
	public static String reverse(String word) {
		word = word.trim();
		String revStr = "";
		for(int i = word.length()- 1; i >= 0; i--) {
			revStr += word.charAt(i);
			
		}
		
		return revStr;
	}

}
