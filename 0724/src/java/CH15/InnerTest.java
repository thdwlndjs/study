package CH15;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부 객체 선언
		Outter out = new Outter("홍길동", 20);
		// 내부 객체 선언
		Outter.Inner in = out.new Inner("서울시 마포구");
		System.out.println("고객 정보 >> " + in.getUserInfo());
		
	}

}
