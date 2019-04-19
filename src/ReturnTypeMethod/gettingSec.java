package ReturnTypeMethod;

public class gettingSec {
	public static void main(String[] args) {
		String result = ("About 691,000,000 results (0.78 seconds)");
		String result1 = resulttime(result);
		System.out.println(result1);
		
	}
	public static String resulttime(String time) {
		String [] words = time.split(" ");
		String s = words[3] + " " + words[4];
		s = s.replace("(", "");
		s = s.replace(")", "");
		
		return s;
		
		
	}

}
