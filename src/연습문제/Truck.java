package 연습문제;

public class Truck extends Vehicle {

	// 트럭의 적재 중량에 대한 객체 변수를 선언한다
	// 필드선언
	private int weight;

// 트럭의 모델명, 가격과 적재 중량을 주어진 값으로 초기화하면서
// 객체를 생성한다
// 생성자 선언
	public Truck(String model, int price, int weight) {
		super(model, price);
		this.weight = weight;
	}

	// 트럭의 적재 중량을 반환한다
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

// 트럭의 세금을 계산한다
// 여기에 메소드를 입력하세요
	public double vehicleTax() {
		if (weight >= 10000) {
			return price * 0.04;
		} else if (weight >= 5000) {
			return price * 0.02;
		} else
			return price * 0.01;
	}

// 트럭의 모델명, 가격과 적재 중량을 반환한다
	public String toString() {
		return super.toString() + ", 적재중량: " + weight + "\n";
	}

}
