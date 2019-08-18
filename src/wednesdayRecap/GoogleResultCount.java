package wednesdayRecap;

public class GoogleResultCount {
	public static void main(String[] args) {
		System.out.println(resultCount("Результатов: примерно 227,000,000"));
	}
	//Результатов: примерно 227,000,000 
	public static String resultCount(String word) {
		String []test = word.split(" ");
		for(int i = 0; i < word.length(); i++) {
			word = test[2].replace(",", "");
		}
		
		return word;
	}

}
