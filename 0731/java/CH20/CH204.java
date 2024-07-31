package CH20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CH204 {
	public static void main(String[] args) {
		long start,end,time;
		start = System.currentTimeMillis();
		try {
			FileInputStream fis = new FileInputStream("C://image//image.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("C://image//image_copy.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			while(true) {
				int count=bis.read();
				if(count==-1)break;
				bos.write(count);
			}
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		time = end-start;
		System.out.println("복사시간:"+time);
	}
}
//객체직렬화