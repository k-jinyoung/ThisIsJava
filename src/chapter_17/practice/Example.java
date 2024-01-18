package chapter_17.practice;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lamda Expressions",
				"Java8 supports lamda expressions"
				);
		list.stream()
		//.toLowerCase()소문자/.toUpperCase()대문자 변환
			.filter(n -> n.toLowerCase().contains("java"))
			.forEach(n -> System.out.println(n));

	}

}
