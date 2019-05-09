package encapsulation;

public class PostTest {
	public static void main(String[] args) {
		Post p1 = new Post("Welcome!");
		p1.info();
		p1.like();
		p1.like();
	
		//p1.info();
		p1.addComment("How are you?!");
		p1.info();
		p1.addComment("\nWhat the hell you are doing now!");
		p1.info();
		
	}

}
