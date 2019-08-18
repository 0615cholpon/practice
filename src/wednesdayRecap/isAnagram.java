package wednesdayRecap;

import java.util.Arrays;

public class isAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("listeo", "silent"));
	}
	public static boolean isAnagram(String word1, String word2) {
		if(word1.length() != word2.length()) {
		return false;
		}
		
		char []test1 = word1.toCharArray();
		char []test2 = word2.toCharArray();
		
		Arrays.sort(test1);
		Arrays.sort(test2);
		
		for(int i = 0; i < word1.length(); i++) {
			if(test1[i] != test2[i]) {
				return false;
			}
		}
		return true;
	
		
		
		
	}

}
