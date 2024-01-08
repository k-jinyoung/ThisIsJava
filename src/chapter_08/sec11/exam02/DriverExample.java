package chapter_08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 메소드 매개변수에 객체를 넣어서 실행(다형성 : 실행 결과가 다름)
		driver.drive(bus);		// drive 메소드에 bus 넣고 실행
		driver.drive(taxi);		// drive 메소드에 taxi 넣고 실행
	}

}
