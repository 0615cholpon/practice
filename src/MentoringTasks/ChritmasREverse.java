package MentoringTasks;

public class ChritmasREverse {
	public static void main(String[] args) {
//		 *
//	    ***
//	   *****
//	  *******
//	 *********
		int lines = 5;
		
		for (int i = 0; i < lines; i++) {
			   for (int j = 0; j < lines - i; j++)
			    System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			  }
		for (int i = lines - 2; i >= 0; i--) {
			for(int j = 0; j < lines - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   System.out.println();
			  }
		}
		
		
		
	}







