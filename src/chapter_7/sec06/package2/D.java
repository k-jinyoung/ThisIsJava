package chapter_7.sec06.package2;

import chapter_7.sec06.package1.A;

public class D extends A { // 다른 패키지 내에 상속을 받기 위해서는 먼저 import를 가져와야 한다.
	
	//생성자 선언
	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value";		//A의 필드
		this.method();				//A의 메소드
	}
	
	public void method2() {
		A a = new A();				// 객체 생성 x
		a.field = "value";			// 생성된 객체 필드 x
		a.method();					// 생성된 객체 메소드 x
	}
	
	//protected 로 설정된 다른 패키지의 클래스를 상속을 받더라도 직접적인 객체 생성은 되지 않는다.
	//protected 상속: 간접적으로 필드나 메소드를 이용할 수 있다.
}
