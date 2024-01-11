package chapter_12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");	//천 단위 마다 , 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");	//천 단위마다, 표시, 소수점 첫째 자리까지 표기
		System.out.println(df.format(num));
	}

}
