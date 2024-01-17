package chapter_16.sec04;

public class LamdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//실행문이 두개 이상일 경우
		person.action((x,y) -> {
			double result = x +y;
			return result;
		});
		
		//return 명령어 생략 가능
		person.action((x,y)->(x+y));

		//sum 함수 이용
		person.action((x,y) -> sum(x,y));
		
	}
	public static double sum(double x, double y) {
		return(x+y);
	}

	

}
