package MentoringTasks;

import java.util.Arrays;

public class BuubleSort {
	public static void main(String[] args) {
		int []arr = {1, 34, 5, 27, -12, -3, 6, 1};
		//System.out.println(Arrays.toString(bubblesSort(arr)));
		System.out.println(binarySearch(arr, 27));
		
	}
//	public static int [] bubblesSort(int [] arr) {
//	}
//		for(int i = 0; i < arr.length - 1; i++) {
//			if(arr[i] > arr[i + 1]) {
//				int temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//				i = -1;
//				
//			}
//		}
//		return arr;
//	}
	
	
	///////    ANOTHER VERSION ///////////////////
//	
//	 int countSwap = 0;
//	 boolean swapped = true;
//	 while(swapped) {
//		 swapped = true;
//		 for(int i = 0; i < arr.length - 1; i++) {
//				if(arr[i] > arr[i + 1]) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				
//
//					swapped = true;
//					
//				}
//			}
//			return arr;
//		}
//	return arr;
//		 
//	 }
	public static int binarySearch(int[] arrN, int num) {
		Arrays.sort(arrN);
		System.out.println(Arrays.toString(arrN));
		int start = 0;
		int end = arrN.length -1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arrN[mid] == num)return mid;
			else if(num < arrN[mid]) {
				end = mid - 1;
				
			}else {
				start = mid + 1;
				
			}
			
		}
		return -1;
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


