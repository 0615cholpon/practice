package Constructors;

public class FaceBookUserTest {
	public static void main(String[] args) {
		FaceBookUser fb1 = new FaceBookUser("Chopa", "abc123");
		fb1.name = "Cholpon";
		fb1.age = 28;
		fb1.friends = 200;
		
		
		FaceBookUser fb2 = new FaceBookUser("Alinka", "abcd1234");
		fb2.name = "Alina";
		fb2.age = 12;
		fb2.friends = 300;
		
		FaceBookUser fb3 = new FaceBookUser("saraAigul", "Aigul", "asd12345");
		//System.out.println(fb3.password);
		
		
//		fb1.sendFriendRequest(fb2);
//		System.out.println(fb2.friends);
//		System.out.println(fb1.friends);
		
		//FaceBookUser test1 = new FaceBookUserTest();
//		test1.name = "Cholpon";
//		test1.username = "Chopa";
//		test1.age = 28;
//		test1.friends = 200;
		
		fb1.userInfo();
		//System.out.println();
		fb2.userInfo();
		//test1.userInfo();
	}

}
