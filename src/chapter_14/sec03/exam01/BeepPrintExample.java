package chapter_14.sec03.exam01;

import java.awt.Toolkit;		//Beep음 생성

public class BeepPrintExample {

	public static void main(String[] args) {
		
		//Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			//beep음 발생
			toolkit.beep();
			
			//0.5초간 일시 정지
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch(Exception e) {}
		
		}
	}
}
