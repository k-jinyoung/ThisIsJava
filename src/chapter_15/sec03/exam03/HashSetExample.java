package chapter_15.sec03.exam03;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();//next에서 객체를 가져온다.
			System.out.println(element);
			if(element.equals("JSP")) {
				//가져온 JSP 객체를 컬렉션에서 제거
				iterator.remove();
			}
		}
		System.out.println();
		
		set.remove("JDBC");
		
		for(String element : set) {
			System.out.println(element);
		}
	}
}
