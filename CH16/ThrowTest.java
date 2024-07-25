package CH16;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외던지기(예외의 전가)
	//메서드 내부에서 예외를 처리하지 않고 미룬 후, 호출한 쪽에서 처리하도록(수신자부담)
//try-catch문은 한번씩 넘어감 그래서 throw로 한번 던져주면 다 잡을수있음

public class ThrowTest {
	public static void Test(Scanner Scan)throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것을 좋아한다.  2. 혼자 있는 것이 좋다");
		System.out.println("선택>>");
		int result=Scan.nextInt();
		if(result<1||result>2)System.out.println("1과 2 중에 선택해주세요");
		else if(result==1) {
			System.out.println("엔프피입니다");
		}
		else{
			System.out.println("잇프피입니다");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.err.println("=================성격 유형 검사를 시작합니다====================");
			ThrowTest.Test(sc);
		}
		catch(InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다");
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
}
