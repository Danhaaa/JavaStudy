package quiz;

import java.util.Scanner;

public class B00_CalcAge {

	// 사용자로부터 태어난 해를 입력받으면 한국 나이를 출력해주는
	// 프로그램을 만들어보세요.
	
	public static void main(String[] args) {
		Scanner yearScanner = new Scanner(System.in);
		
		System.out.println("올해와 태어난 해를 입력해보세요 >> ");
		int thisYear, birthYear;
		
		thisYear = yearScanner.nextInt();
		birthYear = yearScanner.nextInt();
		
		// System.out.printf("나이 : %d", 2023-a);
		System.out.println("나이는 " + (thisYear-birthYear+1));
		
	}
	
}
