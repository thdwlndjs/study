package CH134;

public class Collage extends Student{
	private int course;
	public Collage(String name, int grade,int course) {
		super(name,grade);
		this.course=course;
		System.out.println("Student 매개변수가있는생성자 호출");
	}

	public String getStudInfo() {
		System.out.println("Student 클래스의 getStdInfo() 호출");
		return "이름: "+name+" 학년: "+grade;
	}
	@Override
	public String getTeacher() {
		return "지도 교수님: "+teacher+"담임선생님: 손흥민";
	}
//클래스의 객체타입 변환
// 클래스의 타입변환은 상속관계의 클래스들 간에서만 가능합니다
// 클래스자동타입변환 개발자가 직접 명시해주지 않아도 자동으로 타입변환이 일어나는 것을 강제 타입변환이라고 부릅니다 상속관계에 있는 자식클래스의 객체를 부모 타입의 객체로 변환합니다.
// 클래스 강제타입 변환 자식객체가 부모 타입으로 자동 타입변환을 한 후 다시 자식 타입으로 변환하는것을 간제타입변환이라고 부릅니다 개발자가 직접 명시해야만 타입변환이 가능합니다
// 다형성은 하나의타입으로 다양한 객체를 사용할수 있는것
// 자바는 하나의 클래스 내에서 여러 메서드를 구현할수있다
// 상속받은 메서드를 재정의해 자식클래스용 메서드를 구현하고 자식객체를 이용해 메서드를 호출할땐 오버라이딩
// 오버로딩
// 생성자를 여러개의 타입으로 지정
// 오버라이딩
// 클래스마다 함수를 재정의
}
