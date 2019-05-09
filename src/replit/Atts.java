package replit;

public class Atts {
	public static void main(String[] args) {
		Atts att = new Atts();
		att.name = "Cholpon";
		att.color = "brown";
		att.amount = 1;
		System.out.println(Atts.asString());
	}
	public static String name;
	public static String color;
	public static int amount;
//	public Atts(String name, String color, int amount) {
//		this.name = name;
//		this.color = color;
//		this.amount = amount;
//	}
	public static String asString() {
		String total = "name: " + name + " " + " color: " + color + " amount: " + amount;
		return total;
	}
	
	

}
