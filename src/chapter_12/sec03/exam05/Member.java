package chapter_12.sec03.exam05;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	
	//생성자, getter, setter, toString, hashCode, equals
	private String id;
	private String name;
	private int age;

}
