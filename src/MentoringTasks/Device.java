package MentoringTasks;

public class Device {
String name;
String model;
double price;
boolean isOn;
public void turnOn() {
	isOn = true;
	System.out.println("Device is on");
}
public void turnOff() {
	isOn = false;
}
}
