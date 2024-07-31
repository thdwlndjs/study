package CH20;

import java.io.FileReader;

//read():바이트데이터읽기
public class CH203 {
	public static void main(String[] args) {
		try {
			FileReader r = new FileReader("C://test//test3.txt");
			while (true) {
				int data = r.read();
				if (data == -1)
					break;
				System.out.println((char) data);
			}
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
