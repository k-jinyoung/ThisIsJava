package chapter_08.sec11.exam03;

public class CryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cry 객체 생성
		Cry cry = new Cry();
		
		// Animal 구현 객체 생성
		Chicken chicken = new Chicken();
		Duck duck = new Duck();
		Cow cow = new Cow();
		
		// 메소드 매개변수에 객체를 넣어서 실행 (다형성 : 결과가 다 다름)
		cry.cryer(chicken);			// cryer 메소드에 chicken 넣고 실행
		cry.cryer(duck);			// cryer 메소드에 duck 넣고 실행
		cry.cryer(cow);				// cryer 메소드에 cow 넣고 실행
	}

}
