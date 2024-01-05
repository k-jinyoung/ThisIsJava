package chapter_7.sec06.package2;

import chapter_7.sec06.package1.A;

public class C {			//일반적인 import로는 protected 접근이 불가능하다.
	public void method() {
		A a = new A();		//객체 생성이 되지 않는다.
		a.field = "value";	//필드 사용도 되지 않는다.
		a.method();			//메소드 사용도 되지 않는다.
	}

}
