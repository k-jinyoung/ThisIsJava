package chapter_7.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	}
	//AnimalSound 메소드 생성(매개 변수: Animal 객체를 대입)
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
