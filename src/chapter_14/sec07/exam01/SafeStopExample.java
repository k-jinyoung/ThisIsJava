package chapter_14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();	//스레드 계속 실행
		
		try {
			Thread.sleep(3000);		//시간 딜레이 3초
		}catch(InterruptedException e) {}
		
		printThread.setStop(true);	//3초 뒤에 stop을 true로 변경해서 스레드 종료
	}
}
