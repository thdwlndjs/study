package CH9;

class Student {
	// static이 붙는 멤버들은 객체를 생성하지 않고 바로 사용가능
	protected String name;
	protected int[] score;
	int avg;
	double total;
	double _avg;

	Student() {
	}

	Student(String n, int[] s) {
		name = n;
		score = s;

	}

	Student(String n, int[] s, int a, double t) {
		name = n;
		score = s;
		avg = a;
		total = t;
	}
}
