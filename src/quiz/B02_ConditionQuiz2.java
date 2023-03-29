package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	
	/*
	 	# 알맞은 조건식을 만들어보세요.
	 	
	 	1. char형 변수 a가 'q'또는 'Q'일 때 true
	 	2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	3. char형 변수 c가 '0' ~ '9' 일 때 true
	 	4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	5. char형 변수 e가 한글일 때 true
	 	6. 사용자가 입력한 문자열이 quit일 때 true
	 	
	 */
	
	public static void main(String[] args) {
	
		// 1. char형 변수 a가 'q'또는 'Q'일 때 true
		char a = 'q';
		System.out.println("1번 : " + (a == 'q' ||a == 'Q'));
		
		// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = 0;
		System.out.println("2번 : " + (b != 0 && b != '\t'));
		
		// 3. char형 변수 c가 '0' ~ '9' 일 때 true
		char c = '1';
		boolean result3 = 0<=c && c<9;
		System.out.println("3번 : " + result3);
		
		// 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		char d = '가';
		//boolean result4 = ('a'< d <'z' || 'A'<d<'Z'); 
		//System.out.println("4번 : " + result4);
		
		// 5. char형 변수 e가 한글일 때 true
		//boolean result5 = (e >= '가' && e<='힣');
		//System.out.println("5번 답은: " + result5);
		
		
		
		// 6. 사용자가 입력한 문자열이 quit일 때 true
		
				
		
		
		
		
		
		
	}

}
