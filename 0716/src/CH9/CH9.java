package CH9;

import java.util.Arrays;

public class CH9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] score1 = { 77, 87, 90, 88, 72 };
		int[] score2 = { 81, 67, 91, 77, 83 };
		Student[] s = new Student[2];
		Array a = new Array();

		Clac c = new Clac();
		s[0] = new Student("루피", score1);
		s[1] = new Student("나미", score2);

		for (int i = 0; i < 2; i++) {
			a.arraySort(s[i].score);
			s[i]._avg = c.average(s[i].score.length, a.arrayTotal(s[i].score));
			s[i].avg = c.round(s[i]._avg);
			s[i].total = a.arrayTotal(s[i].score);

			System.out.println(s[i].name + ": " + Arrays.toString(s[i].score));
			System.out.println("총점: " + s[i].total);
			System.out.println("평균: " + s[i].avg);
		}

	}
}
