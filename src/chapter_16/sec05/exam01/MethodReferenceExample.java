package chapter_16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 정적 메소드 -> 클래스명.메소드명
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		
		// 인스턴스 메소드 -> 객체명.메소드명
		person.action(com :: instanceMethod);

	}
}
