package CH15;

// 내부 클래스란?
// 다른 클래스의 내부에 존재하는 클래스를 의미한다.

// 형식
/*class 외부클래스{
	
	class 내부클래스{
		
	}
	
}*/

//내부 클래스의 특징과 용도
// 특징 : 내부 클래스는 외부 클래스 멤버에 자유롭게 접근 가능
// 용도 : 자바나 안드로이드 화면의 이벤트 처리하는 이벤트 핸들러로 사용된다.

// 자바에서 사용되는 내부클래스의 종류
//1. 멤버 내부 클래스 : 외부 클래스의 멤버로 사용됨        (멤버변수)
//2. 로컬 내부 클래스 : 외부 클래스의 메서드 내에서 정의    (로컬(지역)변수)
//3. 정적 내부 클래스 : static으로 지정된 내부 클래스	 (정적 변수_static)
//4. 익명 내부 클래스 : 내부 클래스가 이름 없이 사용됨


// 내부 클래스 객체를 선언하는 방법
// Outer outer = new Outer(); //외부 클래스 객체 생성
// Outer.Inner in = outer.new Inner(); // 외부 클래스를 이용해서 내부 클래스 객체 생성
// 외부클래스이름.내부클래스이름    내부클래스참조변수  =  외부클래스의 참조변수.new 내부클래스();ㅔ

class Cal{
	private int val1; //멤버 
	private int val2;
	
	//생성자 
	public Cal(int val1, int val2)
	{
		this.val1 = val1;
		this.val2 = val2;
	}
	
	//내부 클래스 
	public class Calc{
		//void 반환값이 있는 함수 
		public int add() {
			return val1 + val2;
		}
	}
	
}


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//외부클래스 선언 
		Cal cal = new Cal(10,11);
		//내부클래스 선언
		Cal.Calc c = cal.new Calc();
		System.out.println("합 : " + c.add());
	}

}
