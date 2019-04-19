package Arrays;

public class CountWord {
	public static void main(String[] args) {
		String word = "Write a program that creates a group of given size";
		int counter = 0;
		
		String [] NumOfWords = word.split(" ");
		for(int i = 0; i < NumOfWords.length; i++) {
			if(NumOfWords[i].equals("program")) {
				counter++;
			}
			
		}
		System.out.println(counter);
	}

}
