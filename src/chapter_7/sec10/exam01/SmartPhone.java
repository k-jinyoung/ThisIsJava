package chapter_7.sec10.exam01;

//SmartPhone은 자식
public class SmartPhone extends Phone {
	
	//생성자 선언
	SmartPhone(String owner){
		//Phone 생성자 호출
		super(owner);
	}
	
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷을 검색 합니다.");
	}
}