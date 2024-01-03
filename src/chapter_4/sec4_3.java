package chapter_4;
import java.util.*;
public class sec4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attendScore;
		int assignmentScore;
		int quizScore;
		int midtermexamScore;
		int finalexamScore;
		
		double totalScore;
		char grade; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("출석 점수를 입력하세요: ");
		attendScore = input.nextInt();
		System.out.print("과제시험 점수를 입력하세요: ");
		assignmentScore = input.nextInt();
		System.out.print("수시시험 점수를 입력하세요: ");
		quizScore = input.nextInt();
		System.out.print("중간시험 점수를 입력하세요: ");
		midtermexamScore = input.nextInt();
		System.out.print("기말시험 점수를 입력하세요: ");
		finalexamScore = input.nextInt();
		totalScore =  (attendScore*0.1 + assignmentScore*0.4 + quizScore*0.1 + midtermexamScore*0.2 + finalexamScore*0.2);
		
		if (totalScore >= 90) {
			grade = 'A';
		} else if (totalScore >= 80) {
			grade = 'B';
		} else if (totalScore >= 70) {
			grade = 'C';
		} else if (totalScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}	
		
		System.out.println("총점: " + totalScore);
		System.out.print("학점: " + grade);

	}
}

