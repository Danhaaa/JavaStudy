package create_account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;


// 소문자, 대문자, 숫자, 특수문자만 사용 가능 / 
public class CheckPassword {

	private static String password = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])[\\dA-Za-z!@#$%]{8,16}";

	public static boolean isValidPassword2(String userPass) {
		return Pattern.matches(password, userPass);
	}
	
	public static boolean isValidPassword(String userPass) {
		int len = userPass.length();
	
		

		
		if(len < 8 || len > 16) {
			System.out.println("비밀번호의 길이가 잘못되었습니다.");
			return false;
		}
		
		if(!Pattern.matches("[a-zA-Z\\d!@#$%]{8.16}", userPass)) {
			System.out.println("사용하면 안되는 문자를 사용하셨습니다."
					+ "(소문자, 대문자, 숫자, 특수문자만 사용 가능)");
			return false;
		}
		
		List<Character> mustAdd = new ArrayList<>();
	    Collections.addAll(mustAdd, '!', '@', '#', '$', '%');	
	    
	    boolean digit = false, numeric = false, lower = false, upper = false, special = false;
		
		for(int i = 0; i < len; ++i) {
			char ch = userPass.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				lower = true;
			}else if(Character.isUpperCase(ch)) {
				upper = true;
			}else if (Character.isDigit(ch)) {
				digit = true;
			}else if(mustAdd.contains(ch)) {
				special = true;
			}
		}	
			if(!digit) {
				System.out.println("숫자 미포함");
				return false;
			}else if(!upper) {
				System.out.println("대문자 미포함");
				return false;
			} else if(!lower) {
				System.out.println("소문자 미포함");
				return false;
			} else if(!special) {
				System.out.println("특수문자 미포함");
				return false;
			}

//if else로 비밀번호 검사를 구현하면 무엇때문에 안됐는지 자세히 표현이 가능
		for (int i = 0; i < userPass.length(); ++i) {
			char ch = userPass.charAt(i);
		}
			return true;
	}	 
		
}
