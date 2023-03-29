package gui.quiz.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import gui.quiz.register.login.model.Member;

// 회원가입 관련 작업으로 인한 DB 접근에 대한 코드를 모아놓은 곳
public class RegisterDAO {

	public boolean checkDuplicatedEmail(String email) {
		return true;
	}

	public boolean checkDuplicatedID(String id) {

		String sql = "SELECT count(*) FROM member WHERE mem_id = ?";
		// 개수를 세서 테이블에 있으면

		int count = 1;

		// 1이면 중복 true
		return count > 0;
	}

	public int registerMember(Member m) {
		
		String sql = "INSERT INTO member VALUES(?,?,?,?,?,?,?,?)";
		
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
	
			pstmt.setString(1, m.getMem_id());
			pstmt.setString(2, m.getPassword());
			// pstmt.setString(3, m.get);
			return pstmt.executeUpdate();
	
		} catch(SQLException e) {
			return -1;
		}
	}	
}
