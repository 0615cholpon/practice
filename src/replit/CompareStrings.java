package replit;

public class CompareStrings {
	public static void main(String[] args) {
		String a = "test";
		StringBuilder b = new StringBuilder("test");
		System.out.println();
	}
	public boolean isSame(String a,StringBuilder b) 
	  {
		String test = b.toString();
	   for(int i = 0; i < a.length(); i++) {
		   if(a.equals(test)) {
			   return true;
		   }
	   } 
	   return false;
	  
	  }
	  

}
