package Calender;

public class CalTest {

	public static void main(String[] args) {
		DeskCalender c = new DeskCalender("보라",6);
		c.hang();
		c.OTD();
		Calender d = new DeskCalender("검은색",12);
		d.info();
		d.hang();
	}
}
