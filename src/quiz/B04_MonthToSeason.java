package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {

	/*
	  사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	  (반드시 switch-case문을 사용할 것) 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("몇 월인지 입력하세요 >> ");

		String season;
		int month;
		
		switch (month = new Scanner(System.in). nextInt()) {
		case 12,1,2:
			season = "겨울";
			break;
		case 3,4,5:
			season = "봄";
			break;
		case 6,7,8:
			season = "여름";
			break;
		case 9,10,11:
		    season = "가을";
		default:
			season = "없음";
			break;
			
		}
		
		System.out.printf("%d월은 %s입니다." ,month, season);
	}
	
}
