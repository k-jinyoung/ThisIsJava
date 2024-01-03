package chapter_4;
import java.util.*;
public class sec4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetNumber=0;			//사용자가 맞추려고 노력하는 숫자
		int guessNumber=0;			//사용자가 추측한 숫자
		int count = 0;					// 추측한 횟수
		int sentinel;				// 감시 숫자
		String again = "예";					// 계속 진행할껀지 여부
		
		Scanner input = new Scanner(System.in);		
		Random gr = new Random();
		
		
		
		while (again.equals("예")) {
			targetNumber = gr.nextInt(100)+1;
			while (true) {
				System.out.println("추측한 수 입력:");
				guessNumber = input.nextInt();
				count++;
				if (guessNumber > targetNumber) {
					System.out.println("추측한 숫자가 크다");	
				}
				else if (guessNumber < targetNumber) {
					System.out.println("추측한 숫자가 작다");
				}
				else if (guessNumber == targetNumber) {
					System.out.println("추측한 숫자가 맞다.");
					break;
				}			
				
			}
			System.out.println("총 횟수: " + count);
			System.out.println("추측한 수:" +guessNumber);

			System.out.println("계속 실행? ㅇ or ㄴ");
			again= input.next();
		}
		
	}

}
