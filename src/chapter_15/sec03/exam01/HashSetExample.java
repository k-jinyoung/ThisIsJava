package chapter_15.sec03.exam01;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");		//중복 저장이 불가능하다.
		set.add("Spring");
		
		//set 안에 있는 객체 수를 반환
		int size = set.size();		//사이즈는 인덱스 번호로 세는 것이 아님.
									// 객체 갯수
		System.out.println("총 객체 수: " + size);

	}

}
