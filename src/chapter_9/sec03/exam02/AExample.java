package chapter_9.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A.B.field2);
		b.method2();
	}

}
