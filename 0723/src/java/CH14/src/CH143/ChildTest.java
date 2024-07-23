package CH143;

public class ChildTest {

	public static void main(String[] args) {
		Child1 c1= new Child1();
//		구현클래스 타입변수는 모든 메서드를 호출할수있다
		c1.test();
		c1.method1();
		ITest4 i4= new Child1();
		i4.test();
		i4.method1();
		ITest4 ii4 = (ITest4)i4;
		ii4.test();
		ii4.method1();
	}
}
