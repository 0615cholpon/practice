package encapsulation;

public class UserTest {
	public static void main(String[] args) {
//	User cholpon = new User("Cholpon", 28);
//	User aigul = new User("Aigul", 65);
//	System.out.println(cholpon.friends.size());
//	cholpon.setLocation("Des Plaines");
//	cholpon.info();
//	cholpon.sendFriendRequest(aigul);
//	cholpon.info();
////	cholpon.createPost("Hello, World!");
////	cholpon.createPost("Have a nice evening!");
//	//User.seeTimeline(cholpon);
////	for(int i = 0; i < cholpon.posts.size(); i++) {
////		cholpon.posts.get(i).info();
////	}
////	
//	aigul.createPost("I miss you!");
//	aigul.createPost("Hopefully, see you soon!");
//	aigul.createPost("LOVE you!");
//	User.seeTimeline(aigul);
	User adam = User.createProfile();
//	adam.info();
	User james = new User("James Bond", 65);
	User.seeAllUsers();
	
	
	
	
	
	

	
		
	}

}
