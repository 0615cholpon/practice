package encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	ArrayList<User>friends = new ArrayList<>(); //provides more info from this we may conclude that it is an ArrayList;
	ArrayList<Post>posts = new ArrayList<>();
	private String name;
	private int age;
	private String location;
	static ArrayList<User>allUsers = new ArrayList<>();
	
	public User(String name, int age) {
		this.name = name;
		this.setAge(age);
		allUsers.add(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age <= 120) {
			this.age = age;
		}
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void sendFriendRequest(User object) {
		if(this.friends.size() < 10 && object.friends.size() < 10) {
			object.friends.add(this);
			this.friends.add(object);
			System.out.println(object.name + " is successfully added to the friends list");
			//System.out.println(this.name + " is successfully added to the friends list");

		}else {
			System.out.println("Maximum friends reached!");
		}
		
	}
	public static void seeAllUsers () {
		for(User u: allUsers) {
			u.info();
		}
	}
	public static User createProfile() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!\n");
		System.out.println("Please enter name:");
		String name = input.nextLine();
		System.out.println("Please enter age: ");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Please enter location: ");
		String location= input.nextLine();
		
		User user = new User(name, age);
		user.setLocation(location);
		allUsers.add(user);
		return  user;
		
	}
	public static void seeTimeline(User object) {
		for(Post a: object.posts) {
			a.info();
		}	
	}
	public void info() {
		System.out.println("\nUser Information");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Location: " + this.location);
		System.out.println("Number of friends: " + this.friends.size());
		System.out.println("Number of posts: " + this.posts.size());
	}
	
	public void createPost(String postBody) {
		System.out.println(postBody + " is posted successfully");
		Post post1 = new Post(postBody);
		this.posts.add(post1);
	}
	
	
	
	
	

}
