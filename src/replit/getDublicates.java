package replit;

public class getDublicates {
	public static void main(String[] args) {
		String[] words = {"school", "school", "home", "school", "school"};
		System.out.println(getDup(words));
	}
	public static int getDup(String[] r) {
	    int count = 0;
	    int repeat = 0;
	    for(int i = 0; i < r.length; i++) {
	    	count = 0;
	    	for(int j = 0; j < r.length; j++) {
	    		if(r[i] == r[j] && i != j) {
	    			count++;
	    		}
	    	}
	    		if(count > 0) {
	    			repeat++;
	    		
	    	}
	    }
	    return repeat++;
		   
	  }

}
