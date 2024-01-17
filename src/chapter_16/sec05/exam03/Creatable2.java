package chapter_16.sec05.exam03;

@FunctionalInterface
public interface Creatable2 {
	//추상 생성자(매개변수 2개)
	public Member create(String id, String name);
}
