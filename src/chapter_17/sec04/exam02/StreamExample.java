package chapter_17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;		//정수형 Stream
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//String 배열 생성 String -> Stream<String>		String 객체 : 객체 처리
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);		//strArray에 있는 걸 stream에 가져오겠다.
		strStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		
		//int 배열 생성			int는 타입이다. -> 타입에 맞는 스트림으로 담아준다.(=IntStream)
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ","));
		System.out.println();

	}

}
