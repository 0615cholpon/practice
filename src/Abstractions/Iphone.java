package Abstractions;

public class Iphone extends Phone{
	@Override
	public void call() {
		System.out.println("Iphone is calling in a cool way!");
	}
	
	@Override
	public void internetConnection() {
		System.out.println("Iphone is connected to internet!");
	}
	

}
