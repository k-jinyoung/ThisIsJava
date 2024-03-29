package chapter_12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("선택 번호: ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[]winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨 번호: ");
		
		for (int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i] + " ");
		}
		
		
		
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부: ");
		if(result) {
			System.out.print("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		int counter = 0;
		for(int i=0; i<selectNumber.length; i++) {
			
			for(int j=0; j<selectNumber.length; j++) {
				
				if(selectNumber[i] == winningNumber[j]) {
					counter++;
					System.out.print("공통 번호: " + selectNumber[i] + " ");
				}
			}	
		}
		System.out.println();
		System.out.println("당첨된 개수는" + counter + "개 입니다.");
	}
}
