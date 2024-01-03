package chapter_5;

public class chp_5_7_p164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,타입 String을 학습합니다.,홍길동";
		
		// 쉼표(,)를 기준으로 문자열을 분리한다.
		String[] tokens = board.split(",");
		
		// 인덱스별로 읽는다.
		System.out.println("번호: " + tokens[0]); // 1
		System.out.println("제목: " + tokens[1]); // 자바학습
		System.out.println("내용: " + tokens[2]); // 타입 스트링을 학습힙니다.
		System.out.println("성명: " + tokens[3]); // 홍길동
		System.out.println();
		
		// for문을 이용해서 읽는다.
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
			//tokens[i]: 0번째에서부터 3번째까지 출력하겠다.
		}
	}

}
