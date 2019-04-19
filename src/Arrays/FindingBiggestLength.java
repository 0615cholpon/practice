package Arrays;

public class FindingBiggestLength {
	public static void main(String[] args) {
		String word = "Write a program that createsard a group of given size";
		int maxLength = 0;
		String [] NumOfWords = word.split(" ");
	for(String Words: NumOfWords) {
		if(NumOfWords.length > 0) {
			maxLength = NumOfWords.length;
		}
		
	}
	System.out.println(maxLength);
	}

}
