package chapter_5;

public class chp_5_10_p188 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//길이가 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		
		
		//길이가 5인 배열을 새로 생성한다.
		String[] newStrArray = new String[5];
		
		// 배열 항목 복사
		// old를 new로 복사하고 0번째에부터 시작점을 복사한 것을 붙여 넣는다
		// 복사 인덱스 부분을 1로 바꾸면 복사 항목 수를 2로 바꾸면 실행 된다.
		System.arraycopy(oldStrArray, 1, newStrArray, 0, 2);
		
		// 배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+ ",");
		}
		}
	}


