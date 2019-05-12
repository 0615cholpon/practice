package inheritance;

public class CodingBootTest {
	public static void main(String[] args) {
		CodingBootCamp cybertek = new CodingBootCamp();
		cybertek.address = "2700 S.River Rd";
		cybertek.name = "Cybertek School";
		cybertek.type = "Private";
		cybertek.giveHW();
		cybertek.hostEvent("May 12, 2019");
	}

}
