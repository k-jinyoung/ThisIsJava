package chapter_08.sec10.exam2;

public class Bus implements Vehicle {
	
	//추상 메소드 재정의
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}
	
	//추가 메소드
	public void CheckFare() {
		System.out.println("승차요금을 체크합니다.");
	}
	

}
