package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCombineArrays {
	 public static void main(String[] args) {
		 String[]r1 = {"School", "mom", "baby"};
		 String[]r2 = {"home", "go", "study"};
		 String total = "";
		 ArrayList<String> newArr = new ArrayList<>();
			for(String superN : r1) {
				newArr.add(superN);
	
	}
			for(String superN2: r2) {
				newArr.add(superN2);
				
			}
			
			
		for(String a: newArr) {
			total += a + " ";
		}
		 System.out.println(total);
	 
	
	 
	 }

}
