package CH20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CH201 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C://test//test1.txt");
			while (true) {
				int data = fis.read();
				if (data == -1)
					break;
				System.out.println(((char) data) + "남은데이터수:" + fis.available());
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
