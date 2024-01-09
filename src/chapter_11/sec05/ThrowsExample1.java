package chapter_11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 실행할 메소드 기입
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	//ClassNotFoundException 이 일어나면 호출한 쪽으로 예외를 넘겨준다.(호출한 Main으로 예외를 넘겨준다.)
	public static void findClass()throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}

}
