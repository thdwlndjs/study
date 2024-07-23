package CH141;

public class ChildTest {

	public static void main(String[] args) {
		ITest1 i1 = new Child();
		i1.method1();
		ITest2 i2 = new Child();
		i2.method2();
		ITest2 ii = (ITest2)i2;
		ii.method2();
		Child c = new Child();
		c.method1();
		c.method2();
	}

}
