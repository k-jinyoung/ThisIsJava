package chapter_15.sec04.exam01;

import java.util.HashMap;	//자식
import java.util.Iterator;	//set 데이터를 하나씩
import java.util.Map;		//부모
import java.util.Map.Entry;	//키와 값으로 이루어진  형태
import java.util.Set;		// map 데이터를 set에 넣어서 처리

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성 String: 키, Integer: 값
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);		//키 중복 : 값을 변경 기존 홍길동,90 -> 홍길동, 95
								// 변경된 키로 저장된다.
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);	//키가 홍길동인 엔트리의 값을 가져온다.
		System.out.println(key + ": " + value);
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		//키에 해당하는 부분을 Set으로 저장하고 Set에 있는 것을 하나씩 map.get(set)를 하나씩 대입해서 해당하는 키에 가져온다.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();		//키의 값을 하나씩 가져온다.
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println();
		
		//map의 엔트리(키와 값)를 set으로 가져와서 처리
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {		//가져올 엔트리가 있다면
			Entry<String,Integer> entry = entryIterator.next();		//set 하나의 값을 가져와서 엔트리 형태로 담는다.
			String k = entry.getKey();		//엔트리의 키를 가져온다.
			Integer v = entry.getValue();	//엔트리의 값을 가져온다.
			System.out.println(k + ":" + v);
		}
		System.out.println();
		
		//키를 이용해서 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}

}
