package replit;

public class DataBase2 {
	public static String lameDb(String db, String op,String id,String data){
		String [] newV = db.split("#");
		int num = Integer.valueOf(id);
		if(op.equals("add")) {
			db = db + "#" + id + data;
			
		}else if(op.equals("edit")) {
			db = db.replace(newV[num -1], "#" + id + data);
		}
		else if(op.equals("delete")) {
			db = db.replace(newV[num -1], "");
		}
		else {
			db = db + "#";
		}
		return db;
		
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

		
	

	


