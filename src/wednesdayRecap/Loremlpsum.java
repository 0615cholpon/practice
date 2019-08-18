package wednesdayRecap;

public class Loremlpsum {
	public static void main(String[] args) {
		System.out.println(doesContain("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. "
				+ "In nisl nisi scelerisque eu ultrices vitae auctor eu augue."));
	}
	public static boolean doesContain(String text) {
		String []contain = text.split("\\.");
		for(int i = 0; i < contain.length; i++) {
			if(contain[2].contains("massa")) {
				return true;
			}
		}
		return false;
	}

}
