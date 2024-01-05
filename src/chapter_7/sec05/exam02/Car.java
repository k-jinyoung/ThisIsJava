package chapter_7.sec05.exam02;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 멈춤");		//자식 클래스에서 stop메소드를 수정하지 못하게 final 키워드를 붙인다.
		speed = 0;
	}
}
