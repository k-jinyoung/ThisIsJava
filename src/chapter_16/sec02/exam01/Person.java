package chapter_16.sec02.exam01;

public class Person {
	public void action(Workable workable) {
		workable.work();
		//work() 는 추상 메소드, 실행 시에 람다식으로 구체적인 실행문을 작성해야 한다.
	}
}
