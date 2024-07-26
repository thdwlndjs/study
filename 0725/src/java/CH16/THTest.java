package CH16;

import java.util.Scanner;

//예외를 임의로 발생시킬수있다
//throw new 예외객체(메시지), try-catch 내부 또는 메서드에 예외던지기가 있는 경우
public class THTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("나이를 입력하세요");
			int age=sc.nextInt();
		
			if(age<0) {
				throw new InputErrorException("입력이 잘못되었습니다");
			}
			if(age>19) {
				System.out.println("성인입니다");
			}
			else if(age>13) {
				System.out.println("청소년입니다");
			}
			else if(age>6) {
				System.out.println("어린이입니다");
			}
			else {
				System.out.println("아동입니다");
			}
		}
		catch(InputErrorException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(sc!=null);
			sc.close();
		}
		if(sc!=null) {
			sc.close();
		}
	}
}
//		Scanner sc= new Scanner(System.in);
//		int val=0;
//		while(true) {
//			try {
//				System.out.println("숫자를 입력하세요");
//				val=sc.nextInt();
//				
//				if(val==-1) {break;}
//				else if(val<0||val>50) {
//					throw new Exception("숫자의 허용범위가 아닙니다");
//					
//				}
//			}
//			catch(Exception e) {
//				sc.nextLine();
//				System.out.println("에러메시지:"+e.getMessage());
//			}
//		}
//		sc.close();
//		System.out.println("종료");