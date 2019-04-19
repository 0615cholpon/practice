package MentoringTasks;

public class HourGlass {
	public static void main(String[] args) {
		int lines = 7;
		int counter = 0;
		int countSpace = 0;
		
		for (int i = lines  -1 ; i >= 0; i--) {
			countSpace = 0;
			for (int j = 1; j < lines - i; j++) {
				System.out.print(" ");
				countSpace++;
			}

			for (int k = 0; k < i + 1; k++) {
				countSpace++;
				System.out.print(countSpace + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < lines; i++) {
			countSpace = 0;
			for (int j = 1; j < lines - i; j++) {
				System.out.print(" ");
				countSpace++;
			}

			for (int k = 0; k < i + 1; k++) {
				countSpace++;
				System.out.print(countSpace + " ");
			}
			System.out.println();
		}
		
		
	}

}
