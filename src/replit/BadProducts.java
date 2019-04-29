package replit;

public class BadProducts {
	public static void main(String[] args) {
		int []pros = {1, 1, 1, 0};
		System.out.println(badP(pros, 6));
	}
	public static boolean badP(int[] products,int limit){
		int counter = 0; 
		for(int i = 0; i < products.length; i++) {
			if(products[i] == 0) {
				counter++;	
			}   
	  }
		if(counter >= limit) {
			return false;
		}else {
			return true;
		}
		
		
	}
}

