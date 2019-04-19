package replit;

public class CurrentTaskID {
public static void main(String [] args) {
	boolean check = validateTask(true, 6, 5);
	if(check) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
public static boolean validateTask(boolean notEmpty, int taskID, int currentID) {
	if(notEmpty == true && taskID == currentID+1) {
		return true;
	}else {
		return false;
	}
	
	
}
}
