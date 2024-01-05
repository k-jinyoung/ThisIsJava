package chapter_7;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //이륙
		sa.fly();	//비행 : 일반 비행
		sa.flyMode = SupersonicAirplane.SUPERSONIC;	//모드 변경: 슈퍼소닉
		sa.fly();	// 비행: 초음속 비행
		sa.flyMode = SupersonicAirplane.NORMAL;	//모드 변경: 노멀
		sa.fly();	//비행: 일반 비행
		sa.land();	//착륙

	}

}
