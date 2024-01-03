package chapter_5;

public class chp_5_8_p168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 변수 선언과 배열 생성
		String[] season = {"Spring", "Summer", "Fall", "Winter"}; // 0,1,2,3
		
		
		//배열의 항목값을 읽는다.
		System.out.println("seaseon[0]: " + season[0]);
		System.out.println("seaseon[1]: " + season[1]);
		System.out.println("seaseon[2}: " + season[2]);
		System.out.println("seaseon[3]: " + season[3]);
		
		
		//인덱스 1번 항목의 값을 변경한다.
		season[1] = "여름";
		System.out.println("seaseon[1]: " + season[1]);
		System.out.println();
		
		
		// 배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};
		
		// 총합과 평균 구하기
		int sum = 0;		//초기값 0으로 지정
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum/3;
		System.out.println("평균: " + avg);
}
}
