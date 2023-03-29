package quiz;



public class D08_CheckPhoneNumber {
/*
  사용자로부터 입력받은 문자열이 유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요. 
 
 */	
	
	public static boolean check(String phoneNumber) {
		// 바깥쪽의 공백을 제거
		phoneNumber = phoneNumber.trim();
		
		// 010으로 시작하는 문자열인지 검사
		if(!phoneNumber.startsWith("010")) {
			return false;
		}
		
		// 길이가 11(-가 포함되지 않은 버전) 또는 13(-가 포함된 버전)인가
		int len = phoneNumber.length();
		if(len != 11 && len != 13) {
			return false;
		}
		
		// 길이가 13이라면
		if(len == 13) {
			// -의 위치를 올바른지 확인하고
			if(phoneNumber.charAt(3) != '-' || phoneNumber.charAt(8) != '-') {
				return false;
			}
			// -를 제거한다
			phoneNumber = phoneNumber.replace("-", "");
		}
		
		// 남은 문자열이 모두 숫자인지 확인한다
		for(int i = 0; i < phoneNumber.length(); ++i) {
			if(!Character.isDigit(phoneNumber.charAt(i))){
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(check("010-1234-7896"));
		System.out.println(check("010-1234-12345"));
		System.out.println(check("010-1234"));
		
	}
}
	
	
	/*	
		int numberLength = 11;

		boolean firstNum = false;
		boolean checkNum = false;
		
		String testNum = "01012345678";
		boolean test = Boolean.parseBoolean(testNum);
		
		char[] num = number.toCharArray();
		
		String firstRule = "010";
		
		for(int i = 0; i < number.length(); ++i) {
			num[0] = '0';
			num[1] = '1';
			num[2] = '0';
			firstNum = true;
	}
		
		for(int j = 0; j < number.length(); ++j) {
			char ch = number.charAt(j);
			if(ch >= '0' && ch <= '9') {
				checkNum = true;
			}
		}
	
		if(firstNum && checkNum && test) {
			System.out.println(testNum);
			System.out.println("유효한 번호입니다.");
		}else {
			test = false;
			System.out.println("유효한 번호가 아닙니다.");
		
		}
		
		*/
	
