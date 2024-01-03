package chapter_5;

public class chp_5_12_p192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {				//입력된 데이터(매개변수) 개수가 두 개가 아닐 경우
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);					// 프로그램 강제 종료
		}
		
		String strNum1 = args[0];			//첫번째 데이터 얻기
		String strNum2 = args[1];			//두번째 데이더 얻기
		
		int num1 = Integer.parseInt(strNum1);		//문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);		//문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);

	}

}
