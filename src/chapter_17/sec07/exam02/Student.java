package chapter_17.sec07.exam02;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
	
	//재정의 하지 않는다. Sorted() 메소드에 매개 변수 값을 직접 지정해서 정렬이 되게 한다.

}
