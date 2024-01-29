package chapter_20.mysql.sec07;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardsUpdateExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.200:3306/thisisjava",
					"java",
					"mysql"
			);
			
			//매개변수화된 SQL 문 작성
			String sql = new StringBuilder()
				.append("UPDATE boards SET ")
				.append("btitle=?, ")
				.append("bcontent=?, ")
				.append("bfilename=?, ")
				.append("bfiledata=? ")
				.append("WHERE bno=? ")
				.toString();
			
		//PreparedStatement 얻기 및 값 지정
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "눈사람");
		pstmt.setString(2, "눈으로 만든 사람");
		pstmt.setString(3, "snowman.jpg");
		pstmt.setBlob(4, new FileInputStream("src/chapter_20/mysql/sec07/snowman.jpg"));
		pstmt.setInt(5, 3);
		
		//SQL문 실행
		int rows = pstmt.executeUpdate();
		System.out.println("수정된 행 수: " + rows);
		
		//PreparedStatement 닫기
		pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					//연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}