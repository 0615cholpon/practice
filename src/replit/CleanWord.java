package replit;

public class CleanWord {
	public static void main(String[] args) {
		System.out.println(clean("I hate weather!", "hate"));
		
	}

	public static String clean (String text ,String badWord) {
	    if(text.contains(badWord)){
	      return text = text.replace(badWord, "");
	      
	    }else{
	      return text;
	    }
	

}
}