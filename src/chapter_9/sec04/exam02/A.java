package chapter_9.sec04.exam02;

public class A {
	
	// 메소드
	void useB() {
		class B {		//로컬 클래스 : useB 메소드가 실행될 때 클래스 B 객체 생성이 가능
			
			// 필드
			int field1 = 1;
			// 정적 필드
			static int field2 = 2;
			
			// 생성자
			B(){
				System.out.println("B-생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B-method1 실행");
			}
			static void method2() {
				System.out.println("B-method2 실행");
			}
		}
		
		//useB라는 메소드에서 실행이 된다.
		// B 객체 생성
		B b = new B();
		// b 객체를 이용하여 필드와 메소드 실행
		System.out.println(b.field1);
		b.method1();
		
		// 정적 부분에 직접 클래스 명과 필드, 메소드 입력해서 실행
		System.out.println(b.field2);
		b.method2();
	}
}
