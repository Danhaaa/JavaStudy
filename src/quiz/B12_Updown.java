package quiz;

import java.util.Scanner;

public class B12_Updown {

	/*
	 # Updown 게임을 만들어 보세요.
	 
	  1. 프로그램이 시작되면 1 ~ 200 사이의 랜덤 숫자를 정답으로 선택한다
	  
	  2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	  (잘못된 값이 입력되면 다시 입력)
	  
	  3. 사용자가 정답을 맞추면 몇 번만에 맞췄는지 출력해주고 프로그램을 종료한다
	  
	  4. 5번 안에 못 맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다
	   
	 */
	
	public static void main(String[] args) {
		
		boolean win = false;
	
		int num = (int)(Math.random() * 200 + 1);
		
		System.out.println("정답 생성 완료! (" + num + ")");
		Scanner sc = new Scanner(System.in);
		
	
	// 사용자의 기회는 총 5번
	for(int turn = 0; turn < 5; ++turn) {
		System.out.println(turn + 1 + "번째 입력 >> ");
		  int user = sc.nextInt();
		
		// 잘못된 입력을 먼저 거르는 것이 항상 좋다
		if(user < 1 || user > 200) {
			System.out.println("잘못된 값입니다. 다시 입력해주세요");
			--turn; // -1 시켜서 다시 turn을 count 되지 않도록 한다.
			continue;
		}
		if(user < num) {
			System.out.println("Up");
		}else if(user > num) {
			System.out.println("Down");
		}else {
			System.out.println("정답!");
			break;
		}
	}
	if(!win) {
		System.out.println("정답은 " + num + "이었습니다.");
	}
	System.out.println("프로그램이 끝났습니다.");
		
		
		
		
		/*
		 
		int num = sc.nextInt();
		int count = 1;

		  
		  System.out.println("정답 : " + random);
		 
		num = 0;
		
		for(;count < 6; ++count) {
			if(num == random) {
				System.out.println("정답입니다.");
				break;
			}
			else if(num >= 200 || num >= random) {
				System.out.println("Up");
			}else if(num <= 1 || num <= random) {
				System.out.println("Down");
			}
			System.out.println("횟수 : " + count);
		}
		*/
		
	}
	}





	
