 package replit;

import java.util.ArrayList;

public class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("pen");
		words.add("pencil");
		words.add("phone");
		words.add("notebook");
		words.add("bottle");
		words.add("apple");
		System.out.println(words);
		
		removeEveryOther(words);
		
	}
	public static void removeEveryOther(ArrayList<String> words) {
		for(int i = 0; i < words.size(); i ++) {
			words.remove(words.get(i));
		}
		System.out.println(words);
	}

}
