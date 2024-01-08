package chapter_08.sec07;

public interface Service {
	
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon(); 		//private defaultCommon() 실행
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();		//private defaultCommon() 실행
		
	}
	private void defaultCommon() {		//같은 인터페이스 안에서만 실행: 구현하는 객체 필요
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	
	static void staticMethod1() {	//구현 객체 생성 필요 없이 바로 실행 가능
		System.out.println("staticMethod1 종속 코드");
		staticCommon();		//private static staticCommon() 실행
	}
	static void staticMethod2() {	//구현 객체 생성 필요 없이 바로 실행 가능
		System.out.println("staticMethod2 종속 코드");
		staticCommon();		//private static staticCommon() 실행
	}
	
	private static void staticCommon() {		//같은 인터페이스 안에서만 실행 :구현 객체 생성 필요 바로 실행
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}

}
