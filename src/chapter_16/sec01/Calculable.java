package chapter_16.sec01;

// 함수형 인터페이스 : 람다식으로 표현 가능하다.
@FunctionalInterface		//컴파일 과정에서 추상 메소드가 하나인지 검사한다.
public interface Calculable {
	//추상 메소드
	void calculate(int x, int y);

}
