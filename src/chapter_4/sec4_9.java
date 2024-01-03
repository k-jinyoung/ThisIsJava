package chapter_4;
import java.util.*;
public class sec4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;		//점수
		int count = 0;	//점수들의 개수
		int max = -1;	//최고 점수
		int min = 101;	//최저 점수
		int sum = 0;	//합계 (평균내기위해서)
		double avar;	//평균점수
		
		Scanner input = new Scanner(System.in);
		//jumsu = 0;
		System.out.print("점수를 입력하세요: ");
		jumsu = input.nextInt();
		// 점수 입력 코드
		
		
		while (jumsu != -99) {
			//input jumsu
			sum += jumsu;
			count++;
			if (jumsu < min) {
			 min=jumsu;
			 }
			if (jumsu > max) {
			max=jumsu;
			}
			System.out.print("점수를 입력하세요: ");
			jumsu = input.nextInt();
		}
		avar = (double) sum/count;
		System.out.println("최고 점수: " + max);
		System.out.println("최저 점수: " + min);
		System.out.println("평균 점수: " + avar);
	}

}
