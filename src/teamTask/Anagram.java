package teamTask;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//char [] w1 = {'s', 'i', 'l', 'e', 'n', 't'};
		//char [] w2 = {'l', 'i', 's', 't', 'e', 'n'};
		String w1="silent".toLowerCase();
		String w2="cholpo".toLowerCase();
		System.out.println(isAnagram(w1, w2)); 
		
	}
	public static boolean isAnagram(String word1, String word2) {
		
		 int l1=word1.length();
		 int l2=word2.length();
			
	 if(l1 == l2) {

	char[]newWord = new char[word1.length()];
	char[] newWord2 = new char [word2.length()];
	for(int i = 0; i < newWord.length; i++)	{
		newWord[i] = word1.charAt(i);
		newWord2[i] = word2.charAt(i);
	}	
			Arrays.sort(newWord);
			Arrays.sort(newWord2);
			int counter = 0;
			for(int k = 0; k < newWord.length; k++) {
		if(newWord[k] != newWord2[k])  {
					counter++;
				}
			}	
			if(counter > 0) {
						return false;
				}
					else {
						return true;
					}
			
	}
			
		
	
			return false;
	
}
}
