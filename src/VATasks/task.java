package VATasks;

public class task {
	public static void main(String[] args) {
//	for(int j = 1; j <= 3; j++) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		
//		}
//		System.out.println();
//	}
//	
//	
//	for(int i = 1; i <= 5; i++) {
//	 for(char letter = 'a'; letter <= 'z'; letter++) {
//		 System.out.print(letter + "");
//	 }
//	 System.out.println();
//	 System.out.println("************************");
//	}
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int k = 10; k >= 1; k--) {
			for(int h = 1; h >= k; h++) {
				System.out.print(h + " ");
			}
			System.out.println();
		}

}
}