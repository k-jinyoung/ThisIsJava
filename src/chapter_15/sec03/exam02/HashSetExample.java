package chapter_15.sec03.exam02;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		//Set의 Member 형태를 사용하겠다.
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();
		
		//Member 객체 저장
		//인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수: "+set.size());
		
	}

}
