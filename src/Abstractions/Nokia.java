package Abstractions;

public class Nokia extends Phone{
	
	@Override
	public void call() {
		System.out.println("Nokia is calling!");
	}
	
	@Override
	public void internetConnection() {
		System.out.println("Nokia is connected to internet!");
	}
	

}
