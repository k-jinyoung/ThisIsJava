package chapter_4;
import java.util.*;
public class sec4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		year = input.nextInt();
		
		if (year%4 == 0 && year%100!=0 || year%400 == 0) {
				System.out.print(year +"년은 윤년이다.");
			} else {
				System.out.print(year+"년은 윤년이 아니다.");
			}

	}

}
