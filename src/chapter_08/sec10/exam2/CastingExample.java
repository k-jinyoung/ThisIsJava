package chapter_08.sec10.exam2;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		
		//강제 타입 변환 후
		Bus bus = (Bus)vehicle;
		
		//호출
		bus.run();
		bus.CheckFare();

	}

}
