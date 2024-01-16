package chapter_15.sec03.exam02;

public class Member {
	//필드 선언
	public String name;
	public int age;
	
	//생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	//hashCode 재정의 : 객체 비교 코드 값이 같은지 확인
	//name과 age 값이 같으면 동일한 hashCode가 리턴된다.
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	//메소드
	//equals 재정의 : 객체 안에 데이터를 검증
	//name과 age 값이 같으면 true가 리턴된다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name)&&(target.age==age);
		}else {
			return false;
		}
	}
}
