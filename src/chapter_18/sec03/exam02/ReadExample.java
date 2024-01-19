package chapter_18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);		//is에 있는 파일을 읽어와서 data 배열에 넣는다.
				if(num == -1) break;			//더 이상 읽을 데이터가 없으면 -1을 확인하고 나간다.
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
