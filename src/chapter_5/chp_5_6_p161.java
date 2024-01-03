package chapter_5;

public class chp_5_6_p161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "970818-234567";
		
		String firstNum = ssn.substring(0,2);
		// 시작지점 0번째에서부터 끝지점 6번째 앞까지 자르겠다.
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(2,4);
		// 시작지점 7번째에서부터 끝까지 자르겠다.
		System.out.println(secondNum);
		
		String thirdNum = ssn.substring(4,6);
		System.out.println(thirdNum);

	}

}
