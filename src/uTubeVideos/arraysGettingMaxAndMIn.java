package uTubeVideos;

import java.util.Arrays;

public class arraysGettingMaxAndMIn {
	public static void main(String[] args) {
		int [] scores = {1, 35, 46, 50, 76, 0, 3};
		System.out.println(Arrays.toString(scores));
		int max = scores[0];
		int min = scores[0];
		for(int i = 0; i < scores.length; i++) {
			if(scores.length > max) {
				max = scores.length;
				System.out.println("The maximum number is: " + max);
			}
			
		}

	}

}
