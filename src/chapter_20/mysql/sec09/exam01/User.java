package chapter_20.mysql.sec09.exam01;

import lombok.Data;

// select 문의 결과를 한줄에 담기 위해서 user 클래스를 생성한다.

@Data			//Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
}

