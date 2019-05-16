package replit;

public class ArrayToStringBUilder {
	public static StringBuilder  arrayToSb(String[] r) 
	  {
	    StringBuilder include = new StringBuilder();
	    for(int i = 0 ; i < r.length; i++) {
	    	include.append(r[i]);
	    }
	    return include;
	  
	   
	  }
	  
	  public static void main(String[] args)
	  {
	    
	    String[]  arr = new String[]{"a","1","2"};
	    

	    StringBuilder recipt = arrayToSb(arr);
	    System.out.print(recipt.toString());

	   
	    
	  }//end main

}
