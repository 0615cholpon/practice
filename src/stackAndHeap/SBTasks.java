package stackAndHeap;

import java.util.ArrayList;

public class SBTasks {
	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("mather"));
		System.out.println(removeCon("consequence"));
		System.out.println(removeCon("apple"));
		System.out.println(remove("Kyrgyzstan", "stan"));
		ArrayList<String>word = new ArrayList<String>();
		word.add("James");
		word.add("apple");
		word.add("go");
		word.add("come");
		word.add("to");
		System.out.println(word);
		//add(word);
		add(word, "cholpon");
		
		
	}
	public static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		StringBuilder name = new StringBuilder(word);
		String reversed = name.reverse().toString();
	
	if(reversed.equals(word)) {
      return true;
}
return false;
	}

public static String removeCon(String word) {
	word = word.toLowerCase();
	StringBuilder check = new StringBuilder(word);
	
 if(word.length() < 3) {
		System.out.println("Invalid data!");
		return "";
	}
 else if(word.trim().contains(" ")) {
		System.out.println("Invalid data");
		return "";
	}
 else if(!word.contains("con")) {
	 return word;
 }
 else {
	 check.delete(check.indexOf("con"), check.indexOf("con") + 3);
	 return check.toString();
 }
	
	
}
public static String remove(String word, String targetWord) {
	word = word.toLowerCase();
	StringBuilder word1 = new StringBuilder(word);
	if(word.length() < targetWord.length()) {
		System.out.println("Invalid data!");
		return "";
	}
 else if(word.trim().contains(" ")) {
		System.out.println("Invalid data");
		return "";
	}
 else if(!word.contains(targetWord)) {
	 return word;
 }
 else {
	 word1.delete(word1.indexOf(targetWord.toLowerCase()), word.indexOf(targetWord.toLowerCase()) + targetWord.length());
	 return word1.toString();
 }
	
	
}
public static void add(ArrayList<String>word) {
	
	for(int i = 0; i < word.size(); i++) {
	StringBuilder word1 = new StringBuilder(word.get(i));
		if(word.get(i).length() ==2) {
			word1.insert(1, "hello");
			word.set(i, word1.toString());
		}
		
	}
	System.out.print(word);
	
}
public static void add(ArrayList<String>word, String targetWord) {
	
	for(int i = 0; i < word.size(); i++) {
	StringBuilder word1 = new StringBuilder(word.get(i));
		if(word.get(i).length() == 2) {
			word1.insert(1, targetWord);
			word.set(i, word1.toString());
		}
		
	}
	System.out.print(word);
	
}

}