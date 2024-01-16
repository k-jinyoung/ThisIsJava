package 연습문제.practice03;

public abstract class Pet {

	// 필드 선언
	protected String name; // 이름
	protected int age; // 나이

	// 애완동물의 이름과 나이를 각각 기본 값으로 초기화하면서
	// Pet 객체를 생성한다
	public Pet() {
		this.name = "";
		this.age = 0;
	}

	// 애완동물의 이름과 나이를 각각 주어진 값으로 초기화하면서
	// Pet 객체를 생성한다
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 애완동물의 이름을 변경한다
	public String getName() {
		return name;
	}

	// 이름 알려준다.
	public void setName(String name) {
		this.name = name;
	}

	// 애완동물의 나이를 변경한다
	public int getAge() {
		return age;
	}

	// 애완동물의 나이를 알려 준다
	public void setAge(int age) {
		this.age = age;
	}

	// 애완동물의 이름과 나이를 알려 준다
	public String toString() {
		return "이름: " + name + "나이: " + age;
	};
}
