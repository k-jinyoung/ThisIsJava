package chapter_08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new ServiceImpl();
		
		//디폴트 메소드 호출
		service.defaultMethod1();	//객체 생성해서 실행한 것
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		//정적 메소드 호출
		Service.staticMethod1();	//객체 생성없이 다이렉트로 실행한 것
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}

}
