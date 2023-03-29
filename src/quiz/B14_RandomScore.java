package quiz;

import java.util.Random;

public class B14_RandomScore {

	/*
	 * 1. 학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장
	 * 
	 * 2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 * 
	 * 3. 모든 학생들의 평균 점수를 출력(소수 둘째 자리까지 출력)
	 * 
	 * 4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
	 * 
	 */

	public static void main(String[] args) {

		// 1. 학생 100명의 점수를 생성하여 배열에 저장
		int[] score = new int[100]; // 100개의 방을 만든다

		for (int i = 0; i < score.length; ++i) {
			score[i] = (int) (Math.random() * 101);
		}
		// 2. 출력
		for (int i = 0; i < score.length; ++i) {
			System.out.printf("[%02d]: %-3d", i, score[i]); // 최대가 숫자 3글자라서
			if (i % 10 == 9) {
				System.out.println();
			}
		}
			// 3. 평균
			int sum = 0;
			for (int i = 0; i < score.length; ++i) {
				sum += score[i];

			}
			System.out.println("총합: " + sum);
			System.out.println("평균: " + sum / (double) score.length);

		// 4. 최대값, 최소값
	int max = 0;
	int min = 0;

	for (int i = 0; i < score.length; ++i) {
		// 현재 max에 들어있는 값보다 더 크면 최대값을 교체한다
		if (max < score[i]) {
			max = score[i];
		}
		if (min > score[i]) {
			min = score[i];
		}
	}
		System.out.printf("최대값은 %d\n이고, 최소값은 %d입니다.", max, min);

	}
}

/*
 * 내 풀이
 * 
 * Random ran = new Random();
 * 
 * double sum = 0; int count = 0;
 * 
 * for(int i = 0; i <= 99; i++) { score[i] = ran.nextInt(101);
 * System.out.printf("%d ",score[i]); count++; sum += score[i];
 * 
 * if(count % 10 == 0) { System.out.println();
 * 
 * } } System.out.println(); System.out.printf("평균은 : %.2f", sum / 100);
 * 
 * 
 * for(int i = 0; i <= )
 * 
 * 
 * 
 */
