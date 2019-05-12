package replit;
import java.util.ArrayList;
public class Db {
	  public String blogDb(ArrayList<String[]> r,String id)  {
		  ArrayList<String[]> arr = r;
		 for(int i = 0; i < r.size(); i++) {
			 for(int j = 0; j < r.get(i).length; i++) {
				 if(r.get(i)[j].equals(id)) {
					 return r.get(i)[1] + "\n" + r.get(i)[2];
					 
				 }
			 }
		 }
		return id;   
		    
		   
	  }

}
