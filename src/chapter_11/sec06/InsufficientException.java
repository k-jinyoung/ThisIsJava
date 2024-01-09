package chapter_11.sec06;

public class InsufficientException extends Exception {		//Exception에서 상속 받기: 일반예외가 된다.
	
	// 일반 생성자 : 에러에 대한 간략한 출력
	public InsufficientException() {
		
	}
	//매개 변수 사용하는 생성자 : message : 에러가 발생을 하게 되면 message에 있는 내용을 출력
	public InsufficientException(String message) {
		super(message);
	}
}
