package CH134;

public class SuTest {

	public static void main(String[] args) {
		Student s = new Student() {
			
			@Override
			public String getTeacher() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Middle m = new Middle("차범근");
		Student c = new Collage("홍길동",3,22);
		System.out.println(c.getStudInfo());
		System.out.println(c.getTeacher());
	}
}
