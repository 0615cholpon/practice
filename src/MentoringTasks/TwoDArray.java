package MentoringTasks;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		String [][][] threeDArray = {{{"1", "2"}, {"3", "4"}, {"5", "6"}, {"7", "8"}}};
        System.out.println(Arrays.toString(getNumber(threeDArray)));
		
	}
	public static String[] getNumber(String[][][] value) {
		String target = "";
		String [] result = null;
	for(int i = 0; i < value.length; i++) {
			for(int k = 0; k < value[i].length; k++) {
				for(int j = 0; j < value[i][k].length; j++) {
					if(value[i][k][j].equals("3")) {
						result[0] = value[i][k][j];
					}
				}
			}
		}
		
	return result;

		
		
		
	}

}
