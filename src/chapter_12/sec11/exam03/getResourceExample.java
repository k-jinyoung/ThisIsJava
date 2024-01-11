package chapter_12.sec11.exam03;

public class getResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("Photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/Photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		

	}
}
