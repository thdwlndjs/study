package CTEST;
//super()
//부모클래스의 생성자 호출할때 사용
//자식클래스(매개변수)
//{super(매개변수)}

//this()같은클래스의 다른 생성자 
public class Person {
	String name;
	int age;
	public Person() {}
	public Person(String name, int age) {
		 this.name=name;
		 this.age=age;
	 }
	
}
//접근제한자
//객체지향특) 캡슐화 추상화 상속 다형성
//추상화: 공통된 기능과 정보를 추출해 객체화
//다형성: 하나의 방법으로 여러 객체를 호출하여 사용할 수 있다.
//public>protected>default>private
//모든 외부클래스
//같은 패키지에 있는 클래스와 상속관계의 클래스들만 접근가능
//같은 패키지만
//같은 클래스만
//접근제한자 없으면 default
