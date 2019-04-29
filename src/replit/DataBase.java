package replit;

import java.util.Arrays;

public class DataBase {
	public static String lameDb(String db, String op,String id,String data){ 
		
		String [] wordValue = db.split("#");
	    String res = "";
	    int ind = Integer.parseInt(id)-1;
	    if(op.contains("add")){
	      return db += "#" + id + data;
	    }
		
			for(int i = 0; i < wordValue.length; i++) {
			  
			  if(ind == i){
				
			  if(op.equals("edit")) {
				
				 res +=  id + data+ "#"; 
				 continue;
					
				}
				if(op.equals("delete")) {
				continue;
				}
				
			}
				res += wordValue[i] + "#";
				
		
			}
			return res;
	    
	    
	  }
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n");
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n");
	     
	   }

}
