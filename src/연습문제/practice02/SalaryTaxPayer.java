package 연습문제.practice02;

public class SalaryTaxPayer extends TaxPayer {

	//필드 생성
	private int salary;		// 월급
	int salarySum;

	// 근로소득자의 이름, 번호와 월급을 주어진 값으로 초기화한다
	public SalaryTaxPayer(String name, int number, int salary){
        super(name, number);
        this.salary = salary;
	}

	// 근로소득자의 월급을 반환한다
        public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 근로소득자의 이름, 번호와 월급을 반환한다
	public String toString(){
        return super.toString() + ", 월급: " + salary;
	}
	
	// 근로소득자의 세금을 계산한다

	public double Tax(){
		salarySum = salary*12;
       if(salarySum<=20000000) {
    	   return salarySum * 0.05;
       }else if(salarySum<=40000000){
    	   return salarySum * 0.1;
       }else if(salarySum<=60000000) {
    	   return salarySum * 0.15;
       }else if(salarySum<=80000000) {
    	   return salarySum * 0.2;
       }else
    	   return salarySum * 0.3;
	}
}
