package quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
	  사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	  판별하는 프로그램을 만들어보세요 
	  
	  1. 한 문자씩 꺼내면서 숫자인지 검사한다.
	  2. 끝까지 검사했을때 모두 숫자였으면 true
	  3. 검사하다가 중간에 숫자가 아닌 것을 만나면 false
	  
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean numeric = true;
		
		System.out.print("아무거나 입력하세요 >> ");
		String text = sc.next();
		
		
		for(int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			if(ch >= '0' && ch <= '9') {
				continue;
			} else if(ch <= '0' || ch >= '9') {
				numeric = false;
				break; 		
			}
						
		}
		
		System.out.println("숫자만? " + numeric);	
	}
}

