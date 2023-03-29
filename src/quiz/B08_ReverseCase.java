package quiz;

import java.util.Scanner;

public class B08_ReverseCase {

	/*
	  사용자가 문장을 입력하면 입력한 문장의 소문자는 모두 대문자로,
	  대문자는 모두 소문자로 바꿔서 출력해주세요.
	  (알파벳에 해당하지 않으면 그대로 출력)
	   
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요 >> ");
		
		String in = sc.nextLine();
		
		
		for(int i = 0; i < in.length(); ++i) {
			char ch = in.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				System.out.printf("%c", ch + 32);
			}else if(ch >= 'a' && ch <= 'z') {
				System.out.printf("%c", ch - 32);
			}else {
				// 둘다 아닐때 -> 그냥 출력
				System.out.printf("%c", ch);
			}
		}
		
	}
	
	
	
}
