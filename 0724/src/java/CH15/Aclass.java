package CH15;

//익명 내부 클래스(Annoymous Inner Class)
// 이름이 없는 내부 클래스로, 클래스를 정의 하면서 동시에 인스턴스를 하는 방식

//특징
// 이름이 없기 때문에 단 한 번만 사용될 수 있다.
// 클래스의 정의와 인스턴스의 생성이 동시에 이루어진다.
// 주로 한번만 사용할 구현체를 간편하게 정의 할 때 유용하다

//기존 선언하는 방법
//Person p = new Person();

//익명 클래스 선언하는 방법
//Person p = new Person()
//{ @Override 
//void method()
//{
//}

// 해당 예제는 안드로이드의 버튼 기능을 모방하여 만든 예제
// 안드로이드는 자바 기반으로 만든 언어이다.
// 익명 클래스는 동작과 관련된 이벤트를 구현할 때 자주 사용한다.

//buttonClickListener 인터페이스
interface buttonClickListener{
	//click 함수
	public void click();
}

public class Aclass {
	
	public class Button{
		private buttonClickListener listner;
		
		//리스너를 파라미터(매개변수)를 통해 받는다.
		public void setButtonListener(buttonClickListener listner)
		{
			this.listner = listner;
		}
		
		//버튼 클릭 기능
		//리스너가 있을 때만 동작을 할 수 있음
		public void click()
		{
			if(listner != null)
			{
				this.listner.click();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부클래스를 통해 버튼 클래스 구현
		Aclass a = new Aclass();
		Aclass.Button btn = a.new Button();
		
		// 클래스 생성자 뒤에 중괄호가 추가되고,
		// 해당 클래스가 가진 메서드들을 override 하여 구현하는 방식
		// 클래스 자체를 재정의 하여 구현
		// 구현된 문법 마지막에는 세미콜론(;)을 붙인다.
		
		//익명 클래스는 보통 인터페이스의 기능을 구현할 때 사용
		
		//인터페이스를 익명 클래스로 선언하여 버튼 기능을 구현
		btn.setButtonListener(new buttonClickListener() {
			@Override
			public void click()
			{
				System.out.println("버튼을 눌렀습니다");
			}
			
		});
		
		btn.click();

	}

}
