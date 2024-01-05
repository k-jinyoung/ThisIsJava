package chapter_7;

public class Airplane {
// airplane이 부모다. : 일반 비행기
	
	//부모 메소드 정의
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
