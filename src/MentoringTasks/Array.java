package MentoringTasks;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] one = {"a", "b", "c", "df", "d", "w", "p", "3"};
		String[] two = {"l", "b", "df", "3", "k", "h", "school", "5"};
		String result = "";
		for(int i = 0; i < one.length; i++) {
			for(int k = 0; k < two.length; k++) {
				if(one[i].equals(two[k])) {
					if(!result.contains(one[i])) {
						result += one[i] + " ";
					}else {
						continue;
					}
				}
			}
		}
		System.out.println(result);
		String[] resultArr = result.split(" ");
		System.out.println(Arrays.toString(resultArr));
		
	}

}
