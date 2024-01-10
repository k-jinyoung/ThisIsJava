package chapter_12.sec03.exam02;

public class Student {
	
	//필드 생성
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; }

	/*@Override		//hashCode()를 재정의하지 않으면 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다.
	public int hashCode() {
		int hashCode = no + name.hashCode();	//학번과 이름의 해시코드를 합쳐서 새로운 해시코드
		return hashCode;
		//return super.hashCode();
	}*/

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())){
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
