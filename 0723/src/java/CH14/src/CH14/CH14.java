package CH14;

public class CH14 {
	//추상클래스는 일반클래스퍼럼 필드,생성자,메서드를 가질 수 있다.
	//인터페이스는 멤버(변수)는 상수(=>값을 바꾸지 못한다는 뜻)와 추상 메서드만 가질수있다.
	//public static final int a = hi;
	//static:내부 상수에 접근하려면
	//final:상수를 뜻하는 키워드
	//업캐스팅 참조변수로 사용가능
	//하위클래스 구현(상속X)관계
	//단일 상속을 보완
	public static void main(String[] args) {
		Car c = new Truck();
		//인터페이스 타입은 업캐스팅으로 사용가능
		Car s = new SportsCar();
		//Czr.SAFE_SPEED=80;<<상수라서 불가능
		System.out.println("모든차의 안전속도"+Car.SAFE_SPEED);
		//상수 사용방법: (인터페이스명).(상수명)
		c.SpeedUp();
		c.SpeedDown();
		c.Stop();
		s.SpeedUp();
		s.SpeedDown();
		s.Stop();
		//*
		SportsCar p = (SportsCar)s;
		//구현클래스 객체변수 인터페이스 참조변수
		//*
		p.turbo();
	}
}
