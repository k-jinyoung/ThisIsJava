package chapter_17.sec07.exam01;

public class Student implements Comparable<Student> {
	//필드
	private String name;
	private int score;
	
	//생성자
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// 메소드
	public String getName() {return name;}
	public int getScore() {return score;}
	
	//객체 정렬: Comparable 재정의
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}

}
