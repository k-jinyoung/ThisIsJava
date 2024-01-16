package 연습문제;

public abstract class Vehicle {

	// 차량의 모델명과 가격에 대한 객체 변수를 선언한다
	// 필드 선언
	protected String model;
	protected int price;

	// 차량의 모델명과 가격을 주어진 값으로 초기화하면서
	// 객체를 생성한다
	// 생성자만들기
	public Vehicle(String model, int price) {
		this.model = model;
		this.price = price;
	}

	// 차량 모델 반환
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// 가격 반환
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 차량의 모델명과 가격을 반환한다
	public String toString() {
		return "모델명: "+ model + ", 가격: " + price;
	}

	// 차량의 세금을 계산한다
	// 여기에 메소드를 입력하세요
	public abstract double vehicleTax(); 
}
