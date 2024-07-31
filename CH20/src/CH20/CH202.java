package CH20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CH202 {
	public static void main(String[] args) {
		try {
			FileWriter fos = new FileWriter("C://test//test3.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요");
			String str = sc.nextLine();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				fos.write(ch);
			}
			fos.flush();
			fos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}
