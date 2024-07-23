package CH141;

public class Child implements ITest1,ITest2{

	@Override
	public void method1() {
		System.out.println("method1호출");
	};
	@Override
	public void method2() {
		System.out.println("method2호출");
	};
}
