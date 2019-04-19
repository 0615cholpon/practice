package replit;

public class BookingRoom {
	public static void main(String[] args) {
		System.out.println(simpleRoomBook(true, 7, 2, 2018));
	}
	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year) {
		if(isAvailable == false || (month == 7 && (day >= 1 && day <= 7)) || year != 2018) {
			return false;
		}else {
			return true;
		}
	}

}
