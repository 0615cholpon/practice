package MentoringTasks;

public class NumDownUp {
	public static void main(String[] args) {
		int lines = 7;
		int counter = 0;
		
		for (int i = lines  -1 ; i >= 0; i--) {
			counter = 0;
			for (int j = 1; j < lines - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i + 1; k++) {
				counter++;
				System.out.print(counter + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < lines; i++) {
			counter = 0;
			for (int j = 1; j < lines - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i + 1; k++) {
				counter++;
				System.out.print(counter + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	

}
