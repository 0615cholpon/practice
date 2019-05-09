package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Post {
private ArrayList<String>comments = new ArrayList<>();
private int likes;
private String date;
private String postBody;



public ArrayList<String> getComments() {
	return comments;
}
public void setComments(ArrayList<String> comments) {
	this.comments = comments;
}
public int getLikes() {
	return likes;
}
public String getDate() {
	return date;
}
public void setLikes(int likes) {
	this.likes = likes;
}
public String getPostBody() {
	return postBody;
}
public void setPostBody(String postBody) {
	this.postBody = postBody;
}


public Post(String postBody) {
	
	if(postBody.isEmpty()) {
		System.out.println("Post has no body");
	}else {
		this.postBody = postBody;
	}
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	String dateStr = dateFormat.format(date);
	this.date = dateStr;
	comments = new ArrayList<String>();
	
}
public void info() {
	System.out.println("\nPost Information: ");
	System.out.println("Post Body: " + this.postBody);
	System.out.println("Date: " + date);
	System.out.println("Likes: " + this.likes);
	System.out.println("Comments: ");
	int counter = 1;
	for(String c: this.comments) {
		System.out.println("Comment" + counter + ": " + c);
		counter++;
		
	}
	
}
public void editPost() {

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a new post body: ");
	postBody = input.nextLine();
	
	
}

public void deleteComment(String comment) {
	comments.remove(comment);
	
}

public void addComment(String comment) {
	if(comment.isEmpty()) {
		System.err.println("Comment is empty");
	} else if(comment.contains("hell") || comment.contains("crap") || comment.contains("heck")) {
		System.err.println("Comment contains bad words");
	}else {
		comments.add(comment);
	}
	
}

public void like() {
	likes++;
}








}
