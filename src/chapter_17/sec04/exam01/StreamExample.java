package chapter_17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Product> list = new ArrayList<>();
		for(int i=1; i<=5; i++) {		//5번 실행
			Product product = new Product(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
			
			list.add(product);
		}
		
		//Stream으로 부터 데이터 처리
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));	//스트림에서 객체를 하나 꺼내서(p) 출력(toString) 한다.

	}

}
