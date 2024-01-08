package chapter_08.sec11.exam1;

public class Car {
	
	//필드,  자동 타입 변환
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	
	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
		
	}

}
