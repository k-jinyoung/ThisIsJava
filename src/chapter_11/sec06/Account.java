package chapter_11.sec06;

public class Account {
	
	//필드(변수) 선언
	private long balance;
	
	//생성자
	public Account () {
		
	}
	
	//메소드
	public long getBalance() {		//입금액 확인
		return balance;
	}
	
	public void deposit(int money) {		// 예금
		balance += money;
	}
	
	//										//InsufficientException 발생하면 호출한 곳으로 예외 떠넘기기
	public void withdraw(int money) throws InsufficientException {		//출금
		if (balance < money) {
			throw new InsufficientException("잔고 부족: " + (money-balance)+ "모자람");
		}
		balance -= money;
	}
}
