package chapter_5;

public class chp_5_9_p178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2차원 배열 생성
		// 1차원 배열의 길이는 (80,90,96},{76,88} 이렇게 2개
		int [][] scores = {
				{80,90,96},		// 0행
				{76,88}			// 1행
		};
		
		
		// 배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		// scores[0]은 첫 번째 반
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
		// scores[1]은 두 번째 반
		
		
		// [0]첫 번째 반의 [2]세 번째 학생의 점수
		System.out.println("scorese[0][2]" + scores[0][2]);
		
		// [1]두 번째 반의 [1]두 번째 학생의 점수
		System.out.println("scorese[1][1]" + scores[1][1]);
		
		
		// [0]첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;			// 0으로 초기값을 잡아준다.
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
		
		
		// [1]두 번째 반의 평균 점수 구하기
		int class2Sum = 0;			// 0으로 초기값 잡아준다.
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double)class2Sum/scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		
		// 전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {			// 반 개수 만큼 반복
			totalStudent += scores[i].length;			// 반 학생 수 합산
			for(int k=0; k<scores[i].length; k++) {		// 해당 반의 학생 수만큼 반복
				totalSum += scores[i][k];				// 학생 점수 합산
			}
		}
		double totalAvg = (double) totalSum/totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}
}
