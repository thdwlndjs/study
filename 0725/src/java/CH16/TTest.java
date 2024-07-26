package CH16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TTest {
	public static int inputScore(Scanner Scan) throws NumberFormatException{
		int score = 0;
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		score=Integer.parseInt(str);
		return score;
	}
	public static void main(String[] args) {
		try {
			int score = inputScore();
			System.out.println("입력점수: "+score+"점");
		}
		catch(NumberFormatException e){
			System.out.println("숫자만 입력하세요");
		}
	}
}
