package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_CheckPassWord {
	/*
	  사용자가 사용하고 싶은 비밀번호를 입력하면 사용할 수 있는 비밀번호인지 체크한 후 한번 더 동일하게 입력하도록 만들어보세요 (사용할 수
	  있는 비밀번호의 조건 - 아무 유명 사이트 회원가입을 참조)
	 
	  소문자/ 숫자/ 대문자/ 한글 불가/ 특수문자/ 11자 이하 / asdf123!R
	 */
	
	private static String passwordRegex = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])[\\dA-Za-z!@#$%]{8,16}";
	
	public static boolean isValidPassword2(String userPass) {
		return Pattern.matches(passwordRegex, userPass);
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
			// String mustHave = "!@#$%";
	List<Character> mustHave = new ArrayList<>();
    Collections.addAll(mustHave, '!', '@', '#', '$', '%');

	
	boolean digit = false, numeric = false, lower = false, upper = false, special = false;
			
			for(int i = 0; i < len; ++i) {
				char ch = userPass.charAt(i);
				
				if(Character.isLowerCase(ch)) {
					lower = true;
				}else if(Character.isUpperCase(ch)) {
					upper = true;
				}else if (Character.isDigit(ch)) {
					digit = true;
				}else if(mustHave.contains(ch)) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String userPass;
			while (true) {
				System.out.println("사용하고 싶은 비밀번호 입력 >> ");
				userPass = sc.nextLine();
				if (isValidPassword(userPass)) {
					break;
				}
			}
			System.out.println("다시 한번 입력 >> ");
			if (userPass.equals(sc.nextLine())) {
				System.out.println("일치합니다!");
				break;
			} else {
				System.out.println("확인한 비밀번호가 일치하지 않습니다. 처음부터 다시 합니다.");
			}
		}
	}
}


