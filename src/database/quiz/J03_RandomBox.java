package database.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dataaccess.DatabaseAccess;
import datamodel.GameUser;

public class J03_RandomBox {
	/*
	 사용자가 실행할때마다 무언가를 랜덤으로 뽑는 프로그램을 만들어주세요
	 
	  (1) 랜덤으로 뽑는 물건은 자유 (축구선수, 농구선수, ...)
	  
	  (2) 사용자에게는 재화가 있어서 재화를 다 쓰면 뽑기가 취소되어야 한다 (돈, 다이아몬드, 루비, ...)
	  
	  (3) 모든 상품은 각자의 확률대로 뽑혀야 한다
	  	  - sql에 상품이 들어있는 테이블을 만들어야 한다
	  	   
	  (4) 사용자는 ID와 비밀번호로 인증하면 뽑기를 진행할 수 있다
	  	  - 사용자 아이디와 패스워드가 컬럼인 테이블을 만들어서
	  	    안에 있는 데이터를 자바로 꺼내와서 입력한 아이디와 패스워드가 일치하는지 확인해야 함
	    * 	테이블 2개 정도, DB없이 파일로도 가능하지만 힘듬
	    
	    회원 (아이디, 비밀번호, 소지금, 아이템)
	    소유 아이템 (소유 아이디(PK), 회원 아이디(FK), 아이템 아이디(FK), 획득시간) 
	    아이템 (아이템번호, 이름, 이미지 파일, 확률)
	 */
		
	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		
		// Scanner보다 성능이 좋다
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아이디를 입력해주세요.");
		String userId = in.readLine();
		
		System.out.print("비밀번호를 입력해주세요.");
		String userPassword = in.readLine();
		
		GameUser userInfo = DatabaseAccess.login(userId, userPassword);
		
		System.out.println(userInfo.getUser_id() + "님이 가지고 있는 골드 " 
				+ userInfo.getGold());
	
		while(true) {
			int select = -1; // 아래 보기의 1,2,3이 아닌 임의로 준 값을 넣음
			try {
				System.out.print("1. 뽑기  2. 목록보기  3. 그만하기\n >> ");
				select = Integer.parseInt(in.readLine().trim());
				if(select < 1 || select > 3) {
				continue;
				}
			} catch(NumberFormatException e) {
				continue;
			}
			
			if(select == 1) {
				DatabaseAccess.openBox(userInfo);
			} else if (select == 2)	{
				
			} else if (select == 3) {	
				System.out.println("그만하기를 선택하셨습니다.");
				break;
			}	
		}
	}	
}

	
	/*
	private static int userPoints = 500; 
	
	public static void main(String[] args) {

		String userId = "ezen123";
		String password = "min789";

		Scanner input = new Scanner(System.in);

		System.out.println("아이디와 비밀번호를 입력하세요. ");

		System.out.print("ID : ");
		String idCk = input.nextLine();

		System.out.print("PASSWORD : ");
		String passwordCk = input.nextLine();

		System.out.println("ID : " + idCk);
		System.out.println("PASSWORD : " + passwordCk);

		if (idCk.equals(userId) && passwordCk.equals(password)) {
			System.out.println("로그인 완료!");
		} else {
			System.out.println("로그인 실패입니다");
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "1234");
			System.out.println("연결 생성 완료 ");
			
			String sql = "SELECT * FROM box";
			PreparedStatement pstmt = conn.prepareStatement(sql);
		
			ResultSet rs = pstmt.executeQuery();
			
			Random ran = new Random();
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
			
		}
		
	}
	*/
	



