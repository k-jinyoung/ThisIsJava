package chapter_12.sec03.exam04;

public record Member(String id, String name, int age) {
	//DTO를 위한 Member(String id, String name, int age)생성자,
	//필드 id, name, age
	// getter(), setter() 자동으로 생성이 된다.

}
