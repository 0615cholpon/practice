package replit;

public class FindErrorString {
	public static void main(String[] args) {
		boolean check = isError("error is error");
		if(check) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
	}
	public static boolean isError(String line) {
		if(line.startsWith("error")) {
			return true;
		}else {
			return false;
		}
	}

}
