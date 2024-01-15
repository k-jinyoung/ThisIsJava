package chapter_13.sec02.exam03;

public class Box <T>{
	public T content;
	
	//boolean 타입의 메소드 생성
	public boolean compare(Box<T> other) {
		//제네릭은 Object 타입이라서 Object 메소드 equals를 사용할 수 있다.
		boolean result = content.equals(other.content);
		return result;
	}

}
