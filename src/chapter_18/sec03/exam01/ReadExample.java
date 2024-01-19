package chapter_18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;		//파일이 없을 수도 있기 때문에
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read();		//is를 읽겠다.
				if(data == -1) break;		//-1 파일의 끝에 도닥하면 -1 EOF(End Of File)
				System.out.println(data);	//data 출력
			}
			
			is.close();					//is를 닫겠다.
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
