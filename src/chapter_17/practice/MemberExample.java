package chapter_17.practice;

import java.util.Arrays;
import java.util.List;

public class MemberExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member ("홍길동", 30),
				new Member ("신용권", 40),
				new Member ("감자바", 26)
				);
		
		double avg = list.stream()
				//.mapToInt(member -> member.getAge())
				.mapToInt(Member::getAge)		//p.706 참고
				.average()
				.getAsDouble();
		
		System.out.println("평균 나이: " + avg);
	}

}