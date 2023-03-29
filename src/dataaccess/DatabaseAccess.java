package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import datamodel.GameUser; // 재화 아이템 목록 만들기

public class DatabaseAccess {
	
	 private static String driver = "oracle.jdbc.driver.OracleDriver";
	 private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	 private static String id = "testuser";
	 private static String password = "1234";

	 private static List<Integer> boxItems = new ArrayList<>(); 
	 
	 // 드라이버 호출은 프로그램 실행 시 최초 1번이면 충분하다.
	 static {
		 try {
			 Class.forName(driver);
		 }catch(ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 
	 // 최초의 DB Access 발생 시 아이템 뽑기 배열 생성
		 try(
			Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = conn.prepareStatement(
					"SELECT * FROM item");
			ResultSet rs = pstmt.executeQuery();	 
		) {
			 while(rs.next()) {
				 // 확률만큼 뽑기 배열에 추가하여 확률 생성
				 int prob = Math.round(rs.getFloat("probability") * 100); // 0.3이 30이 됨
				 
				 for(int i = 0; i < prob; ++i) {
					 boxItems.add(rs.getInt("item_id"));
				 }
			 }
			 Collections.shuffle(boxItems);
		 } catch(SQLException e) {
			 
			 e.printStackTrace();
		 }
	 }
	 
	 public static void openBox(GameUser user) {
		 int gold = user.getGold();
		 
		 if(gold < 1000) {
			 System.out.println("소지금이 부족합니다...");
			 return;
		 }
		 // 1. DB 소지금을 감소하고
		 // 2. 아이템 목록에 추가
		 String reduceGold = "UPDATE gameuser SET gold = gold - 1000 WHERE user_num = ?";
		 String addOwnItem = "INSERT INTO ownitem VALUES(ownitem_seq.nextval,?,?,sysdate)";
		 String getItem = "SELECT * FROM item WHERE item_id = ?";
		 
		 try(
		    Connection conn = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt1 = conn.prepareStatement(reduceGold);
			PreparedStatement pstmt2 = conn.prepareStatement(addOwnItem);
			PreparedStatement pstmt3 = conn.prepareStatement(getItem); // 뭘 뽑았는지 보여줄때
				 
		) {
			 // 확률대로 뽑은 아이템의 번호
			 int item_id = boxItems.get((int)(Math.random() * boxItems.size()));
			 
			 // ? 채우기
			 pstmt1.setInt(1, user.getUser_num());
			 pstmt2.setString(1, user.getUser_id());
			 pstmt2.setInt(2, item_id);
			 pstmt3.setInt(1, item_id); // 뽑은 아이템 정보를 꺼내온다
			 
			 
			 // 다 만든 쿼리문 실행하여 DB에 반영하기
			 pstmt1.executeUpdate();
			 pstmt2.executeUpdate();
			 
			 ResultSet rs = pstmt3.executeQuery();
			 rs.next();		 
			 
			 // 뽑은 아이템 정보 가져와서 출력해주기
			 System.out.printf("[%s]님이 [%s]를 뽑으셨습니다.\n",
					 user.getUser_id(), rs.getString("item_name"));
			 user.setGold(gold - 1000);
			 
		 } catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public static GameUser login(String userId, String userPassword) {
		 
		 String sql = "SELECT * FROM gameuser WHERE user_id = ?";
		 
		 try (
			Connection conn = DriverManager.getConnection(url, id, password);
				 PreparedStatement pstmt = conn.prepareStatement(sql);
		) { 
			 pstmt.setString(1, userId);
			 
			 try(ResultSet rs = pstmt.executeQuery()){
				 GameUser user = null;
				 
				if(rs.next())
					user = new GameUser(
						 rs.getInt(1),
						 rs.getString(2),
						 rs.getString(3),
						 rs.getInt(4)
					);
			 
			 // userId의 사용자가 없어서 조회가 안된 경우 null을 리턴
			 if(user == null) {
				 return null;
			 } else {
				 // 로그인 성공
				 if (user.getUser_password().equals(userPassword)) {
					 // 비밀번호 맞춰서 로그인에 성공하는 경우 정보를 리턴 
					 return user;
				 }else {
					 // 비밀번호 틀려서 로그인 실패하는 경우 null을 리턴
					 return null;
				 }
			 }
		 }	 
			 
	}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		 
	 }
}
