package chapter_16.sec05.exam01;

public class Computer {
	// 정적 메소드(객체 생성 없이 바로 사용 가능)
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	
	//인스턴스 메소드(객체 생성 후에 사용 가능)
	public double instanceMethod(double x, double y) {
		return x * y;
	}

}
