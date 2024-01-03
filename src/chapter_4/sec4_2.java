package chapter_4;
import java.util.*;
public class sec4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalCreditEarned; 		//총 이수학점
		int TOEIC;
		
		Scanner input = new Scanner(System.in);
		System.out.print("총 이수학점을 입력하세요: ");
		totalCreditEarned = input.nextInt();
		
		System.out.print("토익점수를 입력하세요: ");
		TOEIC = input.nextInt();
		
		if (totalCreditEarned >= 140) {
			if (TOEIC >= 700) {
				System.out.println("졸업을 축하합니다.");
			}else if (TOEIC < 700) {
				System.out.println("아쉽지만 수료하셨습니다.");
			}
		} else {
			System.out.println("졸업이 불가합니다.");
		}

	}

}
