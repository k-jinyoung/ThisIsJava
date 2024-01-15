package chapter_13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		//홈에이전시 객체 생성
		HomeAgency homeAgency =new HomeAgency();
		// 에이전시에서 rent()룰 통해 home 객체 반환
		Home home = homeAgency.rent();
		//home 객체 사용가능
		home.trunOnLight();
		
		
		//카에이전시 객체 생성
		CarAgency carAgency = new CarAgency();
		//에이전시에서 rent()를 통해 home 객체 반환
		Car car = carAgency.rent();
		//car 객체 사용가능
		car.run();

	}

}
