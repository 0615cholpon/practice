package MentoringTasks;

public class isLeap {
	int year;
	public static void main(String[] args) {
		int year = 2000;
		System.out.println(isLeapYear(year));
	}
	public static boolean isLeapYear(int year) {
		
		if(year % 4 == 0) {
			return true;
		}
		return false;
	}

}
