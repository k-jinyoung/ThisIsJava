package chapter_5;

public class chp_5_11_p190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 변수 선언과 배열 생성
		int[] scores = {95,71,84,93,87};
		
		
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("총합 점수 = " + sum);
		
		
		// 배열 항목 전체 평균 구하기
		double avg = (double) sum/scores.length;
		System.out.println("평균 점수 = " + avg);
	}

}
