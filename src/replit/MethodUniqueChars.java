package replit;

public class MethodUniqueChars {
	public static void main(String[] args) {
		String uniqueW = uniqueChars("wooden-spoon")  ;
		System.out.println(uniqueW);
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    String uniqueChars = "";
	    for(int i = 0; i < str.length(); i++){
	     char letter = str.charAt(i);
	      if(uniqueChars.contains(letter + "")){
	    	  continue;
	      }
	      uniqueChars += letter;
	    }
	    return uniqueChars;
	}
	

}
