package chapter_11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i +"]:" + value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인텍스가 초과됨: " + e.getMessage());
			}catch(Exception e) {		//상위 예회 클래스는 아래쪽에 작성 해야만 에러가 발생하지 않는다.
				System.out.println("실행에 문제가 있습니다.");
			}
		}

	}

}
