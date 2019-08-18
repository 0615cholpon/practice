package wednesdayRecap;

public class BeFibonacci {
	public static void main(String[] args) {
		beFibonacci(20);
	}
	public static void beFibonacci(int num) {
		int previous = 0;
		int next = 1;
		System.out.println("The first " + num + " number of fibonacci series are: ");
		for(int i = 0; i < num; i++) {
			System.out.print(previous + " + ");
			int sum = previous + next;
			previous = next;
			next = sum;
		}
	}

}
