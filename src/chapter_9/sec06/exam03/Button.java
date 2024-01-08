package chapter_9.sec06.exam03;

public class Button {
	
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		// 추상 메소드 선언
		void onClick();
	}
	// 인터페이스 필드 선언
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {	// 버튼 감지
		this.clickListener = clickListener;
	}
	
	public void click() {		// 버튼 실행
		this.clickListener.onClick();
	}
	
}
