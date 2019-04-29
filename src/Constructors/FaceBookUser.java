package Constructors;

public class FaceBookUser {
	String username;
	String name;
	int age;
	String password;
	int friends;
	public FaceBookUser(String username, String password) {
	this.username = username;
	this.password = password;
	}
	public FaceBookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		if(password.contains(username)) {
			System.out.println("Password can't contain username. Please change password");
			//this.password = "";
		}else {
		this.password = password;	
	}
	}
public boolean sendFriendRequest(FaceBookUser user) {
	 if(user.friends < 5000) {
		System.out.println("Friend request sent to " + user.name);
		
		user.friends  ++;
		this.friends ++;
		return true;
		
	}else {
	System.out.println(user.name + " can't accept friend requests!");
	return false;
	}
	
	
}
public  void userInfo() {
	System.out.println("\nFB user info: ");
	System.out.println("Name: " + this.name);
	System.out.println("Username: " + this.username);
	System.out.println("Number of friends: " + this.friends);
	
}
}
