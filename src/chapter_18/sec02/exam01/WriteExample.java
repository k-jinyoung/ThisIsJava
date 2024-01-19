package chapter_18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		//파일, 네트워크, 데이터베이스 같은 경우 예외 처리가 필요하다.
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");			//파일 열기
			
			byte a = 10;					//값 범위 : -128 ~ 127
			byte b = 20;
			byte c = 30;
			
			
			//파일에 데이터를 쓰기
			os.write(a);
			os.write(b);
			os.write(c);
			
			//남은 찌꺼기(잔류 데이터) 정리
			os.flush();
			// 닫기
			os.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
