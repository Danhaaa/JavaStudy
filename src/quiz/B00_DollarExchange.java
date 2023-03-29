package quiz;

import java.util.Scanner;

public class B00_DollarExchange {
/*
  원(￦)을 입력받으면 달러($)로 얼마인지 계산해주는 프로그램을
  만들어보세요. (환율은 구글링 해주세요)
 */
	
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
		System.out.print("원을 입력하세요 >> ");
		
		int won = ex.nextInt();
		double dollar;
		
		// * 정수와 실수의 계산 결과는 실수가 된다
		dollar = won/1400.8;
		
		System.out.printf("달러는 : %.2f\n", dollar);
		

	}
	
}
