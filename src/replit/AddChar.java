package replit;

public class AddChar {
	public static void main(String[] args) {
		String name = at3("Cholpon", "tea");
		System.out.println(name);
	}
	 public static String at3(String target,String word){
		 String total = "";
	    for(int i = 0; i < target.length(); i ++){
	     total = target.substring(0, 3) + word + target.substring(3);
	    }
	    return total;

}
}