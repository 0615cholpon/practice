package replit;

import java.util.Arrays;

public class check {
	public static void main(String[] args) {
		String []word1 = {"Hello", "how", "are", "you?"};
		System.out.println(Arrays.toString(addWordArray("hope", word1)));
	}
	public static String[] addWordArray(String word, String[] array) {
		
		String[] second = new String [array.length + 1];
		String word1 = "hi";

		for(int i = 0; i < second.length; i++){
		    if(i != 0){
		         second[i] = word1;
		    }else{
		         second[0] = "hi";
		    }
		}

		for(String s: second){
		        System.out.println(s);
		}
		return second;
	}

}
