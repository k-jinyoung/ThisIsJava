package chapter_12.sec03.exam01;

public class Member {
	
	// 필드 생성
	public String id;
	
	// 생성자(매개변수: id)
	public Member(String id) {
		this.id = id;
	}

	// 메소드에 대한 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {	//instanceof(타입 비교): obj가 Member 타입인지 비교
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
		
		
	}
	
	
}
