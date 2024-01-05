package chapter_7.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone myPhone = new Phone("홍길동");
		// Phone 클래스가 추상 클래스이기 때문에 객체가 생성 불가하다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		//자식 클래스에서 객체가 생성된다.
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
