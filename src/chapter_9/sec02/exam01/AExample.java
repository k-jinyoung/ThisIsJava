package chapter_9.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 밖(A) 객체 생성
		A a = new A();
		
		//안 (B) 객체 생성
		A.B b = a.new B();

	}

}
