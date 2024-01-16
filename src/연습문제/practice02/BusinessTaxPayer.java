package 연습문제.practice02;

public class BusinessTaxPayer extends TaxPayer {

	private int sales; // 총매출액
	private int expenses; // 총비용
	int sum;

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 주어진 값으로 초기화한다
	public BusinessTaxPayer(String name, int number, int sales, int expenses) {
		super(name, number);
		this.sales = sales;
		this.expenses = expenses;
	}

	// 사업소득자의 총매출액을 반환한다
	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	// 사업소득자의 총비용을 반환한다
	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 반환한다
	public String toString() {
		return super.toString() + ", 총 매출액: " + sales + ", 총 비용: " + expenses + "\n";
	}

	// 사업소득자의 세금을 계산한다
	public double Tax() {
		sum = sales - expenses;
		if (sum <= 0) {
			return sum * 0;
		} else if (sum <= 40000000) {
			return sum * 0.1;
		} else
			return sum * 0.2;
	}

}
