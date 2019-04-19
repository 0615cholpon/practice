package VATasks;

public class StairCase {
public static void main(String[] args) {
	String stairs = "*";
	int num = 1;
	while(num <= 10) {
		System.out.println(stairs);
		stairs += "*";
		num++;
	}
	String minus = "-";
	System.out.println();
	while(minus.length() <= 10) {
		System.out.println(minus);
		minus += "-";
	}
	
	
}
}
