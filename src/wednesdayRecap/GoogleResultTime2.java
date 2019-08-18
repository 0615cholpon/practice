package wednesdayRecap;

public class GoogleResultTime2 {
	public static void main(String[] args) {
		System.out.println(resultTime("About 691,000,000 results (0.78 seconds)"));
	}
	public static String resultTime(String google) {
		
		// About 691,000,000 results (0.78 seconds)
		
		String[]test = google.split(" ");
		String check = "";
		for(int i = 0; i < google.length(); i++) {
			check = test[3].substring(1) + " " + test[4];
			check = check.replace(")", "");
		}
		return check;
	}

}
