package 연습문제;

public class VehicleDriver {

	public static void main(String[] args) {

		// 3,500 cc의 가격이 5,000 만원인 제네시스 승용차를 나타내는 Car 객체를 생성한다
		// 객체 생성
		Car car1 = new Car("제네시스", 50000000, 3500);

		// car1이 가리키는 객체의 모든 데이터를 출력한다
		System.out.print(car1.toString());
		
		
		// car1이 가리키는 객체의 세금을 계산하여 출력한다
		System.out.print(car1.vehicleTax());
		
		System.out.println();

		// 2,500 톤의 가격이 2,000 만원인 봉고 트럭을 나타내는 Truck 객체를 생성한다
		Truck truck = new Truck("truck", 20000000, 2500);

		// truck이 가리키는 객체의 모든 데이터를 출력한다
		System.out.print(truck.toString());

		// truck이 가리키는 객체의 세금을 계산하여 출력한다
		System.out.print(truck.vehicleTax());
		
		System.out.println();

		// 1,000 cc의 가격이 1,500 만원인 쏘울 승용차를 나타내는 Car 객체를 생성한다
		Car car2 = new Car("쏘울", 15000000, 1000);
		// car2가 가리키는 객체의 모든 데이터를 출력한다
		System.out.print(car2.toString());

		// car2가 가리키는 객체의 세금을 계산하여 출력한다
		System.out.print(car2.vehicleTax());
	}

}
