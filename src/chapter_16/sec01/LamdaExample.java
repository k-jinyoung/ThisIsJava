package chapter_16.sec01;

public class LamdaExample {

	public static void main(String[] args) {
		action((x,y)-> {		//action 메소드 실행 (x,y)는 매개변수 : 하나의 추상 메소드를 찾는다.
								// 데이터 처리부에서 추상 메소드를 구체화 시켜준다.
			int result = x+y;
			System.out.println("result: " + result);
		});
		
		action((x,y) -> {
			int result = x-y;
			System.out.println("result: " + result);
		});
	}
		public static void action(Calculable calculable) {
			int x = 10;
			int y = 4;
			calculable.calculate(x, y);		//추상 메소드
	}
}
