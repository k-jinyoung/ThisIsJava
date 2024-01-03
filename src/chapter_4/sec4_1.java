package chapter_4;
import java.util.Scanner;
public class sec4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade; 		//평점
		double TOEIC;
		
		Scanner input = new Scanner(System.in);
		System.out.print("평점을 입력하세요: ");
		grade = input.nextDouble();
		
		System.out.print("토익 점수를 입력하세요: ");
		TOEIC = input.nextDouble();
		
		if (TOEIC >= 700) {
			if (grade >= 4.0) {
				System.out.println("면접 대상자 입니다.");
			}else if (grade >= 3.5){
					System.out.println("서류 전형 대상자입니다.");
				}else if (grade >= 3.0) {
						System.out.println("필기시험 대상자입니다.");
					} else {
						System.out.println("지원할 수 없습니다.");
					}
				} else {
					System.out.println("지원할 수 없습니다.");
				}
				
			}
	}

