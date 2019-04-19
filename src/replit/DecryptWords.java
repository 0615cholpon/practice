package replit;

public class DecryptWords {
	public static void main(String[] args) {
//String words = "Jovswvu3'Hpn|s3'[lopuh3'T|yhilr3'Htpy3'Pzrhr3'Khyprh3'Hp{|y3'ahypwh";
//	for(int i = 0; i< words.length(); i++) {
//		char b = words.charAt(i);
//		b -= 7;
//		System.out.print(b);
//	}
	//////////////////////////////////////////
	
	String secretmessage = "дїўэЈѡїѝЉ";
	String encrypted = "";
	for(int c = 0; c < secretmessage.length(); c++) {
		char k = secretmessage.charAt(c);
		k -= 1000;
		encrypted += k; // if u want to decrypt (-);
	}

	System.out.println(encrypted);
}
}