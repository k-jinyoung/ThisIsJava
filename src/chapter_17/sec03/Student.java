package chapter_17.sec03;

public class Student {
	//필드 선언
	private String name;
	private int score;
	
	//생성자
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}

}
