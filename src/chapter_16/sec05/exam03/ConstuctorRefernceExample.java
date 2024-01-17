package chapter_16.sec05.exam03;

public class ConstuctorRefernceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1(Member :: new);
		System.out.println(m1);	//toString 실행
		System.out.println();
		
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);	//toString 실행

	}

}
