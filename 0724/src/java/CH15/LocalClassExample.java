package CH15;

//지역 클래스 (로컬 클래스)
// 지역클래스는 외부클래스의 메서드 내에서 선언되는 클래스이다.

public class LocalClassExample {

	private int speed = 10;

	// getUnit이라는 함수(메서드) 생성
	public void getUnit(String unitName) {
		// 지역 클래스
		class Unit {
			public void move() {
				System.out.println(unitName + "이" + speed + "속도로 이동합니다");
			}
		}

		// 지역 클래스 선언
		Unit unit = new Unit();
		// 지역 클래스 안에 있는 move함수 사용
		unit.move();
	}

	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");

	}

}
