package chapter_17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> list = Arrays.asList(			//asList : 데이터를 바로 삽입
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);

		/*//방법 1
		Stream<Student> studentStream = list.stream();
		//중간처리(점수만 가져오는 : 필터링) -> Student 객체 -> score int 변환 (매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		
		//최종 처리(평균 점수)
		double avg = scoreStream.average().getAsDouble();*/
		
		
		//방법 2  스트림 파이프라인 처리 방법 : 중간 저장하는 것 필요 없이 한번에 처리가 가능하다.
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균점수: " + avg);
	}

}
