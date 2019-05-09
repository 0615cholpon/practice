package replit;

import java.util.ArrayList;

public class RemoveInstance {
	public static void main(String[] args) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		r.add(1);
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(116);
		r.add(112);
		System.out.println(r);
		System.out.println(removeInst(r, 2));
	}
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	    
	   for(int i = 0; i < r.size(); i++){
	    if(r.get(i) == n) {
	    	r.remove(i);
	    	i--;
	    }
	   
	  }
	   return r;

}
}
