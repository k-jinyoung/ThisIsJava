package chapter_14.sec06.exam01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	//동기화 작업이 일어나면 동기화 작업에 관련된 필드의 값을 변경할 수 없다.
	public synchronized void setMemory1(int memory) {		//메모리 값을 변경시 동기화
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized(this) {		//동기화 블록
			this.memory = memory;
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+ ": "+this.memory);
		}
	}
}