package CH16;

import java.util.InputMismatchException;
import java.util.Scanner;

//error
//program 중요기능 수행을 불가능하게 하는 에러
//해결후 재실행해야함
//예외
//에러보다 가벼운문데
//프로그램 자체적으로 문제해결가능
//예외처리 목적
//예외발생시 프로그램이 비정상 종료되는 것을 막고, 예외와 관련없는 기능은 정상 동작하도록 처리하는 작업을 의미
//예외처리 방법
//실행시 발생하는 예외들을 Exception Class로 제공한다
//예외발생시 JVM이 해당 예외에 대한 클래스 객체를 만들어서 프로그램으로 전달한다
//프로그래머는 해당 예외객체를 받아 예외처리를 한다
//Exception Class생성자
//Exception(),Exception(String messege),Exception(String messege,Throwable cause)
public class CH16 {
	public static void main(String[] args) {
//		NullPointerException:객체는 정의, 실제 메모리에 생성되지 않았을 경우
//		String[] strArray=null;
//		System.out.println("strArray[0]= "+strArray[0]);
		
		
//		NullFormatException:잘못된 문자열을 숫자로 형변환
		
		
//		String str01="11";
//		String str02="11.2";
//		int num01=Integer.parseInt(str01);
//		System.out.println("String to in: "+num01);
//		int num02=Integer.parseInt(str02);
//		System.out.println("String to in: "+num01);
//		String str1="123";
//		String str2="456.7";
//		System.out.println("String to in: "+str1);
//		int num02=Integer.parseInt(str2);
//		System.out.println("String to in: "+str2);
		
//		ArrayIndexOutOfBoundsEcxeption:배열에서 인덱스 범위를 초과해 사용할때 발생
		
//		int arr[] = {1,6,7,9,10};
//		System.out.println(arr[9]);
//		예외처리과정
//		예외가 발생하면 JVM에게 예외를 던진다
//		JVM은 발생한 예외를 분석한 후. 해당예외객체(인스턴스)를 생성한다
//		생성한 예외객체를 예외가 발생한 곳으로 돌려준다.
//		JVM이 던진 예외를 catch문에서 받아서 예외를 처리한다
//		예외를 처리한 후 다른 코드를 정상실행
//		try 
//		{예외가 발생할 가능성이 있는 코드}
//		catch(예외클래스명 e)
//		{예외처리코드}
//		int result =0;
//		try {
//			result=10/0;
//			System.out.println("나누기 결과"+result);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나누기 할 수 없습니다");
//		}
//		System.out.println("프로그램 종료");
//		try-catch-finally문인데 원래는
//		finally (생략가능)
//		예외발생해도 반드시 진행(정상종료)되어야 하는 구문에 사용된다.
		Scanner sc = new Scanner(System.in);
		int[] cards= {4,5,1,2,7,8};
		try {
			System.out.println("몇번째 카드를 뽑으시겠습니까: ");
			int score = sc.nextInt();
			System.out.println(cards[score-1]);
		}
		catch(InputMismatchException e) {
			System.out.println("잘못입력하셨습니다. 숫자만 가능합니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 카드번호가 없습니다");
		}
		sc.close();
		System.out.println("프로그램종료");
	}
}
