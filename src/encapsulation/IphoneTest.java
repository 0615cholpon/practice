package encapsulation;

public class IphoneTest {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.setMemory(128);
		//iphone.model = "6 S Plus";
		iphone.info();
		System.out.println(iphone.getMemory());
	}

}
