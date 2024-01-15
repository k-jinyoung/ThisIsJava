package chapter_14.sec07.exam01;

public class PrintThread extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {	//stop이 true -> false 중지, stop이 false -> true 실행
			System.out.println("실행 중");		//stop명령이 들어오기 전까지 계속 실행
		}
		System.out.println("리소스 정리");	//먼저 리소스 정리가 일어나고
		System.out.println("실행 종료");	//스레드 종료(안전 종료)
	}
}

	//while 구문에서 stop 명령어가 들어오기 전까지 스레드 실행
	//stop 명령어가 들어오면 리소스를 먼저 정리한 이후에 스레드가 종료된다.(안전 종료)