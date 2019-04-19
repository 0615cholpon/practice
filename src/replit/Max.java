package replit;

public class Max {
	public static void main(String[] args) {
		int numbers = 10;
		System.out.println(maxNum(numbers, 0));
	}
public static int maxNum(int x, int max) {
	
	if(x > max) {
		return max;
	}else {
		return x;
	}
	
	
}
}
