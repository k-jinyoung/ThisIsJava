package chapter_4;
import java.util.*;
public class sec4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int buyPrice;
		int discountPrice;
		
		Scanner input = new Scanner(System.in);
		System.out.print("구매금액을 입력하세요: ");
		buyPrice = input.nextInt();
		
		if (buyPrice>=300000) {
			discountPrice = buyPrice - 30000;
		} else if (buyPrice >= 100000) {
			discountPrice = buyPrice - 5000;
		} 
		else {
			discountPrice = buyPrice;
		}
		
		System.out.println("구매금액:" + buyPrice);
		System.out.print("청구금액:" + discountPrice);
		}

	}


