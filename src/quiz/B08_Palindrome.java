package quiz;

import java.util.Scanner;

public class B08_Palindrome {

	/*
	  사용자가 단어를 입력하면 해당 단어가 완벽하게 좌우대칭인지
	  판별해주는 프로그램을 만들어보세요.
	  
	  >> Level
	  -> 좌우대칭이 아닙니다.
	  >> level
	  -> 좌우대칭입니다.
	  >> abba 
	  -> 좌우대칭입니다.  
	 */
	
	// 1. 문제 푸는 절차를 잘못 생각한 경우
	// 2. 어떻게 만들어야되는지는 아는데 자바 문법을 모르는 경우
	
	
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		boolean palindrome = true;
		
		// (1) i번째 글자와 len - i번째 글자가 모두 일치하면 좌우대칭
		
		System.out.print("단어를 입력하세요 >> ");
		
		String word = sc.nextLine();
		
		for(int i = 0, len = word.length(); i < word.length()/2; ++i) {
			
			int i2 = word.length() - 1 -i;
 			
			char ch1 = word.charAt(i);
			// i = 0 1 2 3 4 5 6 ... len-1
			char ch2 = word.charAt(word.length() - 1 - i);
			
			if(ch1 == ch2) {
				System.out.printf("%d번째 [%c]와 %d번째 [%c]가 일치합니다.\n", i, ch1, i2, ch2);
			}else {
			    System.out.printf("%d번째 [%c]와 %d번째 [%c]가 일치하지 않습니다.\n", i, ch1, i2, ch2);
			    palindrome = false;
			}

			}
		System.out.println("좌우대칭 여부: " + palindrome);
		
		
		// straight : 8글자
		// i = 0
		// i : 0 word.length() - i - 1 : 7
		// i : 1 word.length() - i - 1 : 6
		// i : 2 word.length() - i - 1 : 5
		// i : 3 word.length() - i - 1 : 4
		// i : 7 word.length() - i - 1 : 0
		
		int len = word.length();
		String reversed = "";
		
		
		// (2) 글자를 거꾸로 만든 후 거꾸로 되기 전과 똑같으면 좌우 대칭
		
		for(int i = len - 1; i>= 0; --i) {
			reversed += word.charAt(i);			
		}
		System.out.println("원래 문자열: " + word);
		System.out.println("뒤집은 문자열: " + reversed);
		System.out.println("좌우대칭?: " + word.equals(reversed));
                                             		
		// print == tnirp
		// level == level
		
	
		
		}
	}
	
	
	
	

