package chapter_14.sec05.exam02;

public class SumThread extends Thread {
	//필드
	private long sum;

	//메소드
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
}
