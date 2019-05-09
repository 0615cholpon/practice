package replit;

import java.util.ArrayList;

public class ArrayListRemoveAll {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList <>();
		words.add("phone");
		words.add("pencil");
		words.add("phone");
		words.add("tree");
		removeAll(words, "phone");
		
	}
public static void removeAll(ArrayList<String> wordList, String targetWord) {
	
		for(int i = 0; i < wordList.size(); i++) {
			if(wordList.get(i).equalsIgnoreCase(targetWord)) {
				wordList.remove(i);
			}
		}
		System.out.println(wordList);
	}

}
