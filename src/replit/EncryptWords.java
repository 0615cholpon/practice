package replit;
public class EncryptWords {
	public static void main(String[] args) {
		String names = "Cholpon, Aigul, Tehina, Murzabek, Amir, Iskak, Darika, Aitur, Zaripa";
		
		
		for (int i = 0; i < names.length(); i++) {
			char letters = names.charAt(i);
			letters += 7;
			System.out.print(letters);
		}
		
	}

}
