package Abstractions;

public class Connection {
	public static void main(String[] args) {
		Nokia n = new Nokia();
		n.call();
		n.info();
		
		Iphone i = new Iphone();
		i.call();
		i.info();
	}

}
