package 연습문제;

public class Car extends Vehicle {

	// 승용차의 배기량에 대한 객체 변수를 선언한다
	// 여기에 코드를 입력하세요
	//필드 생성
	private int gas;

// 승용차의 모델명, 가격과 배기량을 주어진 값으로 초기화하면서
// 객체를 생성한다
// 여기에 메소드를 입력하세요
	public Car(String model, int price, int gas) {
		super(model, price);
		this.gas = gas;
	}
	// 승용차의 배기량을 반환한다
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	// 승용차의 모델명, 가격과 배기량을 반환한다
	public String toString() {
		return super.toString() + ", 배기량: " + gas + "\n";
	}

	// 승용차의 세금을 계산한다
	public double vehicleTax() {
		if (gas >= 3000) {
			return price * 0.05;
		} else if (gas >= 1500) {
			return price * 0.03;
		} else
			return price * 0.01;
	}

}
