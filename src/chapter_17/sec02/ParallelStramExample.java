package chapter_17.sec02;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStramExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		//병렬 처리 : 스레드
		Stream<String> parallelStream = list.parallelStream();		//병렬 스트림 만들기
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}

}
