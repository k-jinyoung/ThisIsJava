package chapter_17.sec04.exam04;

import java.nio.charset.Charset;		//문자 인코딩
import java.nio.file.Files;				//파일을 사용하겠다.	io: 입출력
import java.nio.file.Path;				//경로
import java.nio.file.Paths;				//경로들
import java.util.stream.Stream;			//String 객체 - Stream

public class StreamExample {

	public static void main(String[] args) throws Exception {
		//  파일의 경로
		//StreamExample 파일이 있는 곳을 기준으로 data.txt 파일을 찾겠다.
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		// data.txt 파일을 한줄씩 Stream에 저장하겠다.
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		// 스트림을 한줄 단위(파일을 한줄 단위로 출력)
		stream.forEach(line -> System.out.println(line));
		stream.close();

	}

}
