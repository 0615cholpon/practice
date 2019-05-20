package MentoringTasks;

public class DeviceRunner {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Android android = new Android();
		Phone phone = new Phone();
		android = (Android)phone; //UpCasting!
		iphone = (Iphone)phone;
		
		phone = android; //RunTime error! DownCasting!
		iphone.wakeUpWithVoice();
		android.wakeUpWithVoice();
	}

}
