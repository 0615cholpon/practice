package VATasks;

public class PrintLetters {
	public static void main(String[] args) throws InterruptedException {
		String word = "Amazon";
		int check = 0;
		while(check < word.length()) {
			System.out.println(word.charAt(check));
			check++;
			Thread.sleep(500);
		}
		System.out.println();
		String str = "Cybertek";
		int rev = str.length()-1;
		while(rev >= 0) {
			
			System.out.println(str.charAt(rev));
			rev--;
			Thread.sleep(500);
		}
	}

}
