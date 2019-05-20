package superPackage;

public class Wall {
	final String color;
	String material;

	public Wall(String material) {
		this.material = material;
		this.color = "Blue";
	}
	/// OR
	public Wall() {
		this.color = "Green";
		this.material = "Glass";
	}
	public static void main(String[] args) {
		Wall w1 = new Wall("Chinese");
		System.out.println(w1.color);
		System.out.println(w1.material);
	}
}
