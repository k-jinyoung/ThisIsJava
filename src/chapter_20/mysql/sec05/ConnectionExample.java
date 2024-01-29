package chapter_20.mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하가
			conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.111.200:3306/thisisjava",			//접속 서버 정보
				"java",						// 데이터베이스 아이디
				"mysql"						//데이터베이스 비밀번호
			);
			
			System.out.println("연결 성공");
			// DB (CRUD)
			// 데이터 추가				insert (into)		C
			// 데이터 불러오기			select				R
			// 데이터 수정				update				U
			// 데이터 삭제				delete				D
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//연결 끊기
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}
}
