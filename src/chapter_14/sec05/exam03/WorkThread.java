package chapter_14.sec05.exam03;

public class WorkThread extends Thread {
	//필드
	public boolean work = true;
	
	//생성자
	public WorkThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {	//true 이면 정상적인 스레드
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();	//false 이면 다른 스레드에게 작업 양보
								// 다른 스레드가 더 많이 실행이 되게 해줌
			}
		}
	}
}
