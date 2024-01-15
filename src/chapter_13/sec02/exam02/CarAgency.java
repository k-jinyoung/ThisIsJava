package chapter_13.sec02.exam02;

public class CarAgency implements Rentable<Car>{	//타입 파라미터P를 Car로 대체하겠다.

	@Override
	public Car rent() {
		return new Car();		//리턴 타입이 반드시 Car가 되어야한다.
	}
	
	
}
