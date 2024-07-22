package Student;


public abstract class Student {

	String name;
	int grade;
	String teacher;
	
	public Student() {
		System.out.println("Student 기본생성자 호출");
	}
	public Student(String teacher) {
		
		this.teacher=teacher;
		System.out.println("Student 매개변수가있는생성자 호출");
	}
	public Student(String name, int grade) {
		this.name=name;
		this.grade=grade;
		System.out.println("Student 매개변수가있는생성자 호출");
	}
	public Student(String name, int grade,String teacher) {
		this.name=name;
		this.grade=grade;
		this.teacher=teacher;
		System.out.println("Student 매개변수가있는생성자 호출");
	}
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStdInfo() 호출");
		return "이름: "+name+" 학년: "+grade;
	}
	public abstract String getTeacher();
}
