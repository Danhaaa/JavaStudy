package quiz;

import java.util.Arrays;

public class B14_Lotto {

	/*
	 * 0. 우선 배열에 랜덤 숫자 6개를 생성해보세요.
	 * 
	 * 1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨 번호를 만들어보세요.
	 * 
	 * 2. 당첨될 때까지 랜덤 로또 번호를 생성하여 몇 회만에 당첨되었는지 출력해보세요.
	 * 
	 */

	public static void main(String[] args) {

		int[] lotto = new int[7]; // 이게 당첨번호라고 친다

		for (int i = 0; i < lotto.length; ++i) {
			// 1번째 랜덤 숫자를 뽑음
			lotto[i] = (int) (Math.random() * 45 + 1);
			System.out.println("방금 뽑은 숫자 : [" + lotto[i] + "]");

			// 이전의 숫자들과 비교해서 뽑았던 숫자가 있다면 다시 뽑아야 함
			for (int j = 0; j < i; ++j) {
				System.out.printf("이전 숫자 %d: %d\n", j, lotto[j]);
				if (lotto[i] == lotto[j]) { // 숫자가 같으면 다시 뽑아라를 만들기
					lotto[i] = (int) (Math.random() * 45 + 1);
					j = -1; // continue는 밑에 넣으면 안됨
					System.out.println("다시 뽑은 숫자 [" + lotto[i] + "]");
					System.out.println("중복이 발생하여 다시 뽑고 처음부터 검사합니다.");
				}
			}

		}
		// 출력
		System.out.println("당첨번호: ");
		for (int i = 0; i < lotto.length; ++i) {
			System.out.printf("lotto[%d]: %d\n", i, lotto[i]);
		}
		System.out.println();

		int buyCount = 0;

		while (true) {
			int[] myLotto = new int[7];

			for (int i = 0; i < myLotto.length; ++i) {
				myLotto[i] = (int) (Math.random() * 45 + 1);

				for (int j = 0; j < i; ++j) {
					if (myLotto[i] == myLotto[j]) {
						myLotto[i] = (int) (Math.random() * 45 + 1);
						j = -1;
					}
				}
			}

			++buyCount;

			// lotto[]와 myLotto[]가 같은지 비교를 해야 한다.
			// -> 당첨 번호 6개가 myLotto[]에 포함되어 있는지 검사해야 한다
			int winCount = 0;
			for (int i = 0; i < myLotto.length; ++i) {
				for (int j = 0; j < myLotto.length; ++j) {
					if (lotto[i] == myLotto[j]) {
						++winCount;
						break;
					}
				}
			}
			if (winCount == 7) {
				System.out.print(buyCount + " 1등 당첨! ");
				break;
			} else if (winCount == 6) {
				System.out.print(" 2등! ");
				// java.util.Arrays.toString(arr) : 배열을 문자열로 변환
				System.out.print(Arrays.toString(myLotto));
			} else if (winCount == 5) {
				System.out.print(" 3등! ");
			} else if (winCount == 4) {
				System.out.print(" 4등! ");
			} else if (winCount == 3) {
				System.out.print(" 5등! ");
			}

		}

	}

}
