
public class B06_For {
/*
	# 반복문 (Loop)
	
	- for, while, forEach, do-while(X)
	- 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
	
	# for문
	- for (초기값 설정; 반복 조건; 증감값) {
		가운데의 반복 조건이 참인 동안 반복될 코드들 적기
	}
	   
	- 초기값: 다양한 변수들을 초기화 하는 용도로 사용하는 곳
	- 반복 조건: 가운데의 조건이 참인 동안 {}안의 내용을 계속 실행
	- 증감값: {}의 내용이 모두 실행하고 나면 값을 변화시키는 용도로 사용 
	
	*/
	
	public static void main(String[] args) {
		// Hello, world!를 1000번 출력해주세요(복붙금지일때)
		
		for(int i=0; i<10; ++i) {
		//for(int i=0; i<=12; i +=3) { // 0,3,6,9,12	
		System.out.println("Hello, world! " + i);
		
		for(int j=100; j>0; j -=5) {
			System.out.println("Hello! " + j);
		}
		
		/*
		  1. 가장 기본적인 형태의 for문
		  - 초기값에 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다
		  - 원하는 횟수만큼 반복하고 싶을때 가장 많이 사용하는 
		    형태의 for문
		 */
		
		for(int a = 0; a<143; ++a) {
			System.out.printf("%d회 반복중입니다.\n", a);
		}
		/*
		  2. 초기값, 조건, 증감값을 자유롭게 설정한 for문
		  - 초기값, 조건, 증감값은 자유롭게 변경하여 용도에
		  	  맞게 사용할 수 있다
		  - 증가값에는 +도 사용할 수 있고, -도 사용할 수 있다  
		 */
		
		for(int b=7; b<100000; b*=7) {
			System.out.println(b);
		}
		
		for(int c = 483928123; c>0; c/=10) {
			System.out.println(c);
		}
		
		/*
		  3. 각 자리에 값을 생략한 for문
		  - 초기값, 조건, 증감값은 모두 생략하여 사용할 수 있다
		  - 조건을 생략하면 무한 반복하게 된다
		  - ;;은 꼭 넣어야한다
		 */
		
		int num = 10;
		for(;num<100;) {
			System.out.printf("%d\n", num);
			num += 20;
		}
		System.out.printf("반복문이 모두 끝난 후의 num: %d\n", num);
	
		
		
		}	
	}
	
	}
	
