package chapter_12.sec03.exam03;

public class SmartPhone {
	
	//필드생성
	private String company;
	private String os;
	
	//생성자 생성
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + "," + os;
	}
	

}
