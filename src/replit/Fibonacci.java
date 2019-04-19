package replit;

public class Fibonacci {
	public static void main(String[] args) {
		int MaxNum = 6;
		int PreviousNum = 0;
		int NextNum = 1;
		System.out.print("Fibonacci series of " + MaxNum + ": ");
		for(int i = 0; i < MaxNum; i++) {
			System.out.print(PreviousNum + " ");
			int sum = PreviousNum + NextNum;
			PreviousNum = NextNum;
			NextNum = sum;
			
			
			
			
		}
	}

}
