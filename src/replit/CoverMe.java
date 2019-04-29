package replit;

public class CoverMe {
	public static void main(String[] args) {
		System.out.println(coverString("Lets study Engl", "school"));
	}
public static String coverString(String main, String coverME) {
	
	String str = "[" + coverME + "]";
		if(main.contains(coverME)) {
			return main = main.replace(coverME, str);	
		}
		else {
			return "[" + main + "]";
		}
		
		}
	
	

	
}



