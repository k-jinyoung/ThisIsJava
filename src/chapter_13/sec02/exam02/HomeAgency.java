package chapter_13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{ //타입 파라미터P를 Home으로 대체하겠다.

	@Override
	public Home rent() {
		return new Home();		//리턴 타입이 반드시 Home이어야 한다.
	}
	

}
