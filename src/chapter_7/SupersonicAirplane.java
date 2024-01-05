package chapter_7;

public class SupersonicAirplane extends Airplane {
	//상수 선언
	public static final int NORMAL = 1;	//일반 비행
	public static final int SUPERSONIC = 2;	//초음속 비행
	
	//상태 필드 선언
	public int flyMode = NORMAL;

	@Override
	//메소드 재정의
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
		super.fly();
	  }
	}
}
