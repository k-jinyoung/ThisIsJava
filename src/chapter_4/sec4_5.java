package chapter_4;
import java.util.*;
public class sec4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		boolean multiple = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		number = input.nextInt();
		
		if (number%3 == 0) {
			multiple = true;
			System.out.println("3의 배수");
		}  if (number%5 == 0) {
			multiple = true;
			System.out.println("5의 배수");
		}  
		if (number%8 == 0) {
			multiple = true;
			System.out.println("8의 배수");
		} 
		if (multiple == false) {
			System.out.println("어느 배수도 아니다");
			
		}
		
		

	}

}
