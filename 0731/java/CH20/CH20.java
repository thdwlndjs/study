package CH20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//write()메서드로 파일에 바이트 데이터 출력하기
public class CH20 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C://test//test1.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요");
			String str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				fos.write(ch);
			}
			System.out.println("파일을 출력했습니다");
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//자바입출력(i/o)
//스트림(Stream)
// 개울,개천,물이나 액체의 흐름
// 외부장치가 데이터가 입력되거나 출력되는 것이 물의 흐름과 같다고 해서 스트림이라고 불리게 됨

//자바 스트림의 정의 
// 자바에서 장치데이터를 입풀력 할 수 있게 도와주는 기능
// 자바의 입출력을 도와주는 클래스

//스트림 클래스: 단방향FIFO, 같은 용도의 스트림 클래스끼리 연결이 가능하다

//자바스트림의 클래스 종류
//문자 스트림 클래스: 입출력시 문자데이터를 이용하여 입출력 작업을 하는 클래스 
//바이트 데이터 입출력시 바이트 데이터를 이용하여 입출력 작업을 하는 클래스

//자바스트림이 처리하는 데이터 종류
//바이트 데이터
//동영상 이미지 사운드와 가은 멀티 미디어데이터를 의미

//문자데이터
//일반적인 문자데이터
//2byte단위로 입출력이 이루어짐