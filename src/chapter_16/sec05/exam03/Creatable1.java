package chapter_16.sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
	//추상 객체(매개 변수 하나)
	public Member create(String id);
}
