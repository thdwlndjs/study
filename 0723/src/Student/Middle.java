package Student;

public class Middle extends Student{

	public Middle() {
		System.out.println("Student 매개변수가있는생성자 호출");
	}

	public Middle(String teacher) {
		super(teacher);
		System.out.println("Student 매개변수가있는생성자 호출");
	}
	public Middle(String name, int grade,String teacher) {
		super(name,grade,teacher);
		System.out.println("Student 매개변수가있는생성자 호출");
	}

	@Override
	public String getTeacher() {
		return teacher;
	}
}
