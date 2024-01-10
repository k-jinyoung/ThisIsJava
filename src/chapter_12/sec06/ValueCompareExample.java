package chapter_12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		//-128~127 초과값일 경우
		Integer obj1 =300;		//따로 객체 생성
		Integer obj2 =300;		//따로 객체 생성
		System.out.println("==: " + (obj1 == obj2));	//저장되어 있는 번지 비교
		System.out.println("equals(): " + obj1.equals(obj2)); //값을 비교
		System.out.println();
		
		//-128~127 범위값일 경우
		Integer obj3 = 10;	//Integer 값 범위 안에 있을 때는 객체 생성하고
		Integer obj4 = 10;	//범위 안에 있는 것이라 생성된 것 찾아서 주소 참조
		System.out.println("==: " + (obj3 == obj4));
		System.out.println("equals: " + obj3.equals(obj4));

	}

}
