package Calender;

public class DeskCalender extends Calender{
	
	public DeskCalender(String color,int month) {
		super(color,month);
	}
	@Override	
	void hang() {
		super.info();
		System.out.println(color+"달력을 벽에 걸기위해 고리가 추가로 필요합니다");
	}
	void OTD() {
		System.out.println("달력을 책상에 세울 수 없습니다");
		System.out.println("");
	}
}
