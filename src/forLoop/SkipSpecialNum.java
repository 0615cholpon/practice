package forLoop;

public class SkipSpecialNum {
	public static void main(String[] args) {
// write a program that prints every single # from 0-50. Skip the numbers that
// ends with 3.
//		for (int num1 = 0; num1 < 50; num1++) {
//			if (num1 % 10 == 3) {
//		continue;
//			}
//			System.out.println(num1);
	//	}
		
		
		
		for (int i = 0; i < 50; i++) {
			String b = i + "";
			if(b.endsWith("3")) {
				continue;
			}
			System.out.println(i);
		}
	}

}
