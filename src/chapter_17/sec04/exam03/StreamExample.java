package chapter_17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);		//1은 시작 값, 100은 끝 값
																//1부터 100까지 범위의 값이 IntStream에 담아지게 된다.
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);

	}

}
