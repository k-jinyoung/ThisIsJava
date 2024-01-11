package chapter_12.sec11.exam01;

import chapter_06.sec06.Car;

public class GetClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class clazz = Car.class;
		
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackageName().getName());
		System.out.println("패키지: " + clazz.getSimpleName());
		System.out.println("패키지: " + clazz.getName());

	}

}
