package replit;

public class SBReplace {
	public static void main(String[] args) {
		String[] r = {"cholpon", "pen", "flower", "notebook"};
		System.out.println(replaceWith(r, "pen", "pencil"));
	}
	public static StringBuilder replaceWith(String[] r,String replace,String replaceWith) 
	  {
	    StringBuilder newBuilder = new StringBuilder();
	    for(int i = 0; i < r.length; i++){
	     if(r[i].equals(replace)){
	    	 newBuilder.append(replaceWith);
  
	     }else {
	    	 newBuilder.append(r[i]);
	     }
	   }
	    return newBuilder;
	   
	  }

}
