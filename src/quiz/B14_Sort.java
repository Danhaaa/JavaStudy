package quiz;

import java.util.Arrays;

public class B14_Sort {

	/*
	 * 랜덤 int 30개가 들어있는 배열을 생성한 후
	 * 
	 * (1) 해당 배열의 내용을 작은 값부터 차례대로 (오름차순) 저장한 새로운 배열을 생성하여 출력해보세요.
	 * 
	 * (2) 해당 배열의 내용을 큰 값부터 차례대로 (내림차순) 저장한 새로운 배열을 생성하여 출력해보세요.
	 * 
	 */

	public static void main(String[] args) {

		int[] num = new int[30];
		
		// Arrays.fill(arr. value) : 해당 배열을 원하는 값으로 가득 채울 때 사용
		// Arrays.fill(num, (int)(Math.random() * 100));
		
		for(int i = 0; i < num.length; ++i) {
			num[i] = (int)(Math.random() * 1000 - 500);
			
		}
		
		int[] ascending = new int[30];
		
		// 배열의 시작 주소 전달 -> 두 배열 변수가 같은 배열을 가리키게 된다
		// ascending = num;
		
		// 배열 내부의 값 복사 -> 두 배열이 다른 값을 지니게 된다.
		// 복사의 이유 : 처음 값을 보고싶어서 
		for(int i = 0; i < num.length; ++i) {
			ascending[i] = num[i];
		}
		
		// i: 내가 제일 큰 값을 찾아서 넣어야 하는 위치
		for(int i = 29; i >= 0; --i) {
			
		// 제일 큰 값의 위치를 찾는 곳				
		int max_index = 0;
			for(int j = 1; j <= i; ++j) {
				if(ascending[max_index] < ascending[j]) {
					max_index = j;
				}
			}
			
			// 찾은 가장 큰 값과 마지막 위치의 값을 교환
		int temp = ascending[i];
			ascending[i] = ascending[max_index];
			ascending[max_index] = temp;
		}
		
		// 내림차순은 직접 해보기 
		
		System.out.println("정렬 전 배열: " + Arrays.toString(num));
		System.out.println("오름차순: " + Arrays.toString(ascending));
		
		
		int[] descending = new int[30];
		
		for(int i = 0; i < num.length; ++i) {
			descending[i] = num[i];
		}
		for(int i = 29; i >= 0; --i) {
			int min_index = 0;
			for(int j = 1; j <= i; ++j) {
				if(descending[min_index] > descending[j]) {
					min_index = j;
				}
			}
			int temp = descending[i];
			descending[i] = descending[min_index];
			descending[min_index] = temp;
		
		}
		System.out.println("내림차순: " + Arrays.toString(descending));
		
	}
}

		
		/* 내 풀이
		int[] num = new int[30];

		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 1000);
		}

		for (int i = 0; i < num.length; ++i) {
			System.out.printf("랜덤 숫자들 : %d ", num[i]);

			for (int j = 0; j < num.length-i; ++j) {
				if (num[j] < num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
					tmp = num[j];
					System.out.println(tmp);
				}


			}

		}
*/
	
