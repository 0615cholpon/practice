package ReturnTypeMethod;

public class arrayMethod {
	public static void main(String[] args) {
		int [] total = {23, 45, 65, 29};
		System.out.println(arrayContains(total, 79));
	}
	public static boolean arrayContains(int [] arr, int target) {
		for(int i: arr) {
			if(i == target) {
				return true;
			}
			
		}
		return false;
		
	}

}
