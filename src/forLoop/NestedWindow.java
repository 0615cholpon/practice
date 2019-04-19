package forLoop;

public class NestedWindow {
	public static void main(String[] args) {
	// Labeling Loop:
	myOuterLoop:
		for (int i = 0; i < 5; i++) {
		myInnerLoop:
			for (int j = 0; j < 10; j++) {
				
				if(j == 5) {
					continue myInnerLoop; 
// will break inner loop! //We need to mention which loop we need to break;
					
				} else if( j == 7) {
					break myOuterLoop;
				}
				System.out.print(j);
			}
		}
	}

}
