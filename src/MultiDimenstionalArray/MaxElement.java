package MultiDimenstionalArray;



public class MaxElement {
	public static void main(String[] args) {
		int [][] numbers = {{12, 34, 56}, {1, 5, 90}, {100, 2, 600}};
		Maxnum(numbers);
	}
public static void Maxnum(int [][] nums) {
	int MaxNum = nums[0][0];
	
	for(int i = 0; i < nums.length; i++) { //Outer Array iterates
		for(int j = 0; j < nums[i].length; j++) {
			if(nums[i][j] > MaxNum) {
				MaxNum = nums[i][j];
				
			}
		}
	}
	System.out.println(MaxNum);
		}
	
}	


