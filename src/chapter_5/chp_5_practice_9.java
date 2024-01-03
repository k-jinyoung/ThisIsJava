package chapter_5;
import java.util.*;
public class chp_5_practice_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 학생들의 점수를 분석하는 프로그램을 만들려고 한다.
		 키보드로부터 학생수와 각 학생들의 점수를 입력 받고 while문과 Scanner의 nextLine 메소드 이용해서
		 최고 점수와 평균 점수를 출력하라.
		 
		 1.학생 수와 점수 변수 선언
		 2. 학생 수와 각 학생들의 점수를 입력
		 */
		int student;
		int [] scores = null;
		int sum = 0;
		int max = 0;
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		// 5번 반복
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNum = Integer.parseInt(input.nextLine());
			
			if(selectNum == 1){
				System.out.print("학생수> ");
				student = Integer.parseInt(input.nextLine());
				scores = new int[student];
			} else if(selectNum == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(input.nextLine());
				}
			}else if (selectNum == 3) {
				for(int i=0; i<scores.length; i++) 
				 System.out.println("score["+i+"]: " + scores[i] );				
			} else if (selectNum == 4) {
				for(int i=0; i<scores.length; i++) {
					sum = sum + scores[i];
					
					if(max<scores[i]) {
						max = scores[i];	
					}
				}
				double avg = (double) sum/scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
				} else if (selectNum == 5) {
				run = false;
			}
		}
		System.out.print("프로그램 종료");
	}

}
