package VATasks;

public class WhileReversedCounter {
public static void main(String[] args) throws InterruptedException  {
	int num = 1;
	while (num <= 10) {
		System.out.print(num + ", ");
		num++;
		Thread.sleep(1000);
	}
	System.out.println();
	System.out.println("Total number of value is: " + num);
	
	int num2 = 11;
	while (num2 >= 1) {
		System.out.print(num2 + ", ");
		num2--;
		Thread.sleep(1000);
	}
}
}
