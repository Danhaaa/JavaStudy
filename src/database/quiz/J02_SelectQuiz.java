package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_SelectQuiz {
/*
  testuser 계정에 테이블을 아무거나 (컬럼 4개 이상) 추가하고 데이터를 추가한 뒤
  자바에서 Select로 조회한 결과를 콘솔에 출력해보세요
 
 */

public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로드 완료");
	} catch (ClassNotFoundException e) {
		System.out.println("클래스를 찾지 못했습니다.");
	}
	
	
	try {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "1234");
		System.out.println("연결 완료 " + con);
		
		String sql = "SELECT * FROM locations INNER JOIN "
				+ "departments USING (location_id)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);	
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.printf("%-20s\t%2s\t%-20s\t%d\n",
					rs.getString("city"),
					rs.getString("country_id"), 
					rs.getString("street_address"),
					rs.getInt("department_id"));
					
		}
		rs.close();
		pstmt.close();
		con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	
}


