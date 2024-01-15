package chapter_13.sec05;

//지원자: 어떤 사람이 들어올지 몰라서 제네릭으로 표기
public class Applicant<T> {
	//필드 생성
	public T kind;
	
	//생성자
	public Applicant(T kind) {
		this.kind = kind;
	}
}
