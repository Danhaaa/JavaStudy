package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있다.
	 * 
	 * 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요. 50 / 5 = 5
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너 생성

		System.out.print("사과의 개수를 입력하세요 >> "); // 입력 안내
		
		int basket_size = 10;
		int apple_qty = sc.nextInt();
		

		if (apple_qty % basket_size > 0) { // 사과가 10으로 딱 나눠지지 않을 때
			System.out.println("바구니 개수 : " + (apple_qty / basket_size) + 1);
		} else if (apple_qty <= 0) { // -로 쓴 경우에는 0으로 나오도록 설정
			System.out.println(apple_qty = 0);
		} else { // 사과 개수가 10으로 나누어지는 수일 때
			System.out.println("바구니 개수 : " + (apple_qty / 10 + 1));

			// 다른 풀이 : answer = (int)Math.ceil(apple / (double)basket);
			// 둘 중 하나가 실수여야 정확한 값이 나온다

		}

	}

}
