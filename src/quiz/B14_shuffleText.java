package quiz;

import java.util.Scanner;

public class B14_shuffleText {

	/*
	 * 사용자로부터 문장을 입력 받으면 해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어보세요.
	 * 
	 */

	public static void main(String[] args) { // 3가지 방법 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> ");
		
		String text = sc.nextLine();
		
		System.out.println("입력받은 문장: " + text);
		
		
		// 변수에 저장된 두 값을 교체할 때는 
		// 값을 잠시 담아 놓을 수 있는 변수가 하나 더 필요하다
		int a = 10;  int b = 20; int c;
		
		c = a;
		a = b;
		b = c;
		
		char[] shuffleArray = text.toCharArray();
				
		// 랜덤 위치의 문자를 선택해 첫 번째 문자와 만 번 교환하기
		for(int i = 0; i < 10000; ++i) {
			int random_index = (int)(Math.random()* text.length());
			
			char temp = shuffleArray[0];
			shuffleArray[0] = shuffleArray[random_index];
			shuffleArray[random_index] = shuffleArray[0];
		}
		System.out.println("셔플 결과: " + new String(shuffleArray));
		System.out.println("===========================");
		
		// 중복 없이 모든 인덱스를 선택하면 문자를 섞을 수 있음
		
		// 이미 들어있으면 다른 곳에 넣기
		char[] origin = text.toCharArray(); // 원본
		char[] dst = new char[origin.length]; // 결과물
		
		// origin에서 순서대로 하나씩 꺼내서 dst의 랜덤 위치에 저장
		for(int i = 0; i < origin.length; ++i) {
			int random_index = 
								(int)(Math.random() * origin.length);
			
			
			// origin에서 임의로 선택한 위치에 제대로 된 문자가 있다면
			if(origin[random_index] != 0) {
				// dst로 복사한 후 그곳을 0으로 만든다
				dst[i] = origin[random_index];
				origin[random_index] = 0;
			}else {
				--i;
			
		// random_index에 다른 문자가 들어간 적이 없으면 옮김
		// if(dst[random_index] == 0) {
		// dst[random_index] = origin[i];
			//}else {
				// random_index에 다르느 문자가 이미 들어가 있다면
				// 새로운 random_index를 선정함
				//--i;
			}
		}
		
		
		// new String(char[])을 통해 char[]을 다시 문자열로 만들 수 있음
		System.out.println("원본: " + new String(origin));
		System.out.println("섞은 후: " + new String(dst));
		
		
		System.out.println("===========================");
		
		
		int len = text.length();
		int [] index = new int[len];
		
		for(int i = 0; i < text.length(); ++i) {
			int random_index = (int)(Math.random() * len);
		
		for(int j = 0; j < i; ++j) {
			if(index[i] == index[j]) {
				index[i] = (int)(Math.random() * len);
				j = -1;
			}
			}
			System.out.print(text.charAt(index[i]));
		}
	}
	}

/*
 * 내 풀이 Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("문장을 입력하세요 >> ");
 * 
 * String msg;
 * 
 * msg = sc.nextLine();
 * 
 * char[] msgArr = msg.toCharArray();
 * 
 * int random_index = (int)(Math.random() * msg.length()); for(int i = 0; i <
 * msg.length(); ++i) { if()) { System.out.println(msgArr[random_index]); }
 * 
 * 
 * // System.out.println("랜덤 문자 위치: " + random_index); //
 * System.out.println("그 랜덤 위치의 문자: " + msgArr[random_index]);
 * 
 * }
 * 
 */
