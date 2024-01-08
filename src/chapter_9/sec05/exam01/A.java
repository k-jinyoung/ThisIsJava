package chapter_9.sec05.exam01;

public class A {

	//A의 인스턴스 필드와 인스턴스 메소드
	int field1;
	void method1() {}
	
	//정적 필드와 정적 메소드
	static int field2;
	static void method2() {}
	
	//B가 인스턴스 멤버 클래스(안에 B가 인스턴스 인 경우)
	class B{
		void method() {
			field1 =10;		//밖에 인스턴스 필드
			method1();		//밖에 인스턴스 메소드
			
			field2 = 10;	// 밖에 정적 필드
			method2();		// 밖에 정적 메소드
		}
	}
	
	static class C{		//  이 시점에서 class A가 외부에 있는 인스턴스 필드와 메소드가 생성이 안될 수 있다.
		void method() {
		field2 = 10;
		method2();
		}
	}
}
