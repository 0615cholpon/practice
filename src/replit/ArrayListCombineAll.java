package replit;

import java.util.ArrayList;

public class ArrayListCombineAll {
	public static void main(String[] args) {
		ArrayList<String> wordList1 = new ArrayList<>();
		wordList1.add("school");
		wordList1.add("phone");
		ArrayList<String> wordList2 = new ArrayList<>();
		wordList2.add("case");
		wordList2.add("pen");
		System.out.println(combineAl(wordList1, wordList2));
	
	}
	public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){
		ArrayList <String> sum = new ArrayList<>();
		for(String a: wordList1) {
			sum.add(a);
		}
		for(String b: wordList2) {
			sum.add(b);
		}
		return sum;
		
	}

}
