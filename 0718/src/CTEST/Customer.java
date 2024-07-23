package CTEST;

public class Customer extends Person{

	int memberID;
	
	public Customer() {}
	public Customer(String name, int age,int memberID) {
		super.name=name;
		super.age=age;
//		this.name=name;
//		this.age=age;
		this.memberID=memberID;
	}
	void enter() {
		System.out.println("회원번호: "+ memberID+" "+name+" , "+age+"세 입장");
	}
	
}
//this 사용해도 되는거같은데,
//상위클래스로 올려준다는 구분하기 좋은거같고, 
//this는 쓸때마다 한줄씩 잡아먹는데, 코드도 짧아지는거같음
