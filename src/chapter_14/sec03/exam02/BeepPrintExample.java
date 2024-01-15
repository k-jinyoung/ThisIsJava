package chapter_14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	//메인 스레드가 실행하는 코드
	public static void main(String[] args) {
		// 작업 스레드를 Runnable을 통해 직접 생성
		Thread thread = new Thread(new Runnable() {
			@Override
			//run 스레드 main()
			//스레드가 실행할 코드
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch (Exception e) {}
				}
			}
		});
		
		
		// 작업 스레드 실행
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
