package ReturnTypeMethod;

public class GoogleTask {
	public static void main(String[] args) {
		String result = ("About 691,000,000 results (0.78 seconds)");
		String res = resultCount(result);
		System.out.println(res);
		
		String b = resultCount("kfgakfg 123,4566,777 jflagsfla ljhflasf; ");
		System.out.println(b);
		
	}
	public static String resultCount(String count) {
		String [] words = count.split(" ");
		String s = words[1];
		s = s.replace(",", "");
		return  s;
	}

}
