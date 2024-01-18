package chapter_17.sec09;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		//특정 조건에 만족하는지 확인(매칭)
		int[] intArr = {2,4,6};
		
		//모든 요소의 2의 배수 확인
		boolean result = Arrays.stream(intArr)		//intArr 스트림 배열로 변환
				.allMatch(a -> a%2 == 0);			//  모든 요소가 2의 배수인가?
		System.out.println("모두 2의 배수인가? " + result);
		
		//하나 이상의 요소가 3의 배수인가?
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);

		//모든 요소가 3의 배수가 없는가?
		result = Arrays.stream(intArr)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없는가? " + result);
	}

}
