package chapter_08.sec10;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;	//인터페이스 A 에 변수 a 선언
		
		a = b;	// A <- B(자동 타입 변환)
		a = c;	// A <- C(자동 타입 변환)
		a = d;	// A <- D(자동 타입 변환)
		a = e;	// A <- E(자동 타입 변환)
		
		// B, C : 인터페이스A 구현
		// D, E : B, C를 상속받은 자식
		// B, C, D, E는 인터페이스A 타입으로 대입이 가능하다. 인터페이스 안에 있는 메소드 사용가능

	}

}
