package chapter_18.sec03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];		//1024byte -> 1M
		while(true) {
			int num = is.read(data);		//원본 파일을 배열로 읽어 오기
			if(num == -1) break;			//더이상 읽을 데이터가 없으면 -1을 확인하고 나간다.
			os.write(data,0,num);
		}
		
		os.flush();
		os.close();
		is.close();

		System.out.println("복사가 잘 되었습니다.");
	}

}
