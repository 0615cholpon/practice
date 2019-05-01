package VATasks;

public class check {
	public static void main(String[] args) {
//		for(int i = 1; i <= 2; i++) {
//			for(int j = 1; j <= 10; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//			System.out.println("********************");
//		}
//		for(int i = 0; i <= 2; i++) {
//			if(i % 2 == 0) {
//		for(char letter = 'a'; letter <= 'z'; letter++) {
//			System.out.print(letter + " ");
//		}
//		}else if(i % 2 == 1) {
//			for(char letter = 'z'; letter >= 'a'; letter--) {
//				System.out.print(letter + " ");
//			}
//		}
//		System.out.println();
//		System.out.println("****************************");
//		}
		
		for(int j = 1; j <= 10; j++) {
			for(int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int j = 10; j >= 1; j--) {
			for(int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
