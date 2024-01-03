package chapter_4;
import java.util.*;
public class sec4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;			//입력 받는 점수
		int totalCount = 0;	//점수들의 총 개수
		int Acount = 0;		//A 학점의 수, 90점 이상
		int Bcount = 0;		//B 학점의 수, 80점 이상 90점 미만
		int Ccount = 0;		//C 학점의 수, 70점 이상 80점 미만
		int Dcount = 0;		//D 학점의 수, 60점 이상 70점 미만
		int Fcount = 0;		//F 학점의 수, 60점 미만
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		score = input.nextInt();
		
		while (score != -1) {
			totalCount++;
			if (score >= 90) {
				Acount++;
			}
			if (score >= 80 & score < 90) {
				Bcount++;
			}
			if (score >= 70 & score < 80) {
				Ccount++;
			}
			if (score >= 60 & score < 70) {
				Dcount++;
			}
			if (score < 60) {
				Fcount++;
			}
			System.out.print("점수를 입력하세요: ");
			score = input.nextInt();
		}
		
		System.out.println("점수들의 총수: " + totalCount);
		System.out.println("A 학점 수: " + Acount);
		System.out.println("B 학점 수: " + Bcount);
		System.out.println("C 학점 수: " + Ccount);
		System.out.println("D 학점 수: " + Dcount);
		System.out.println("F 학점 수: " + Fcount);
	}

}
