
public class B10_While {

	
	/*
	  
	  # While
	  - for문과 사용법이 약간 다른 반복문
	  - 초기값과 증감값의 위치가 정해져있지 않다 (자유롭다)
	  - ()안의 내용이 true면 {}안의 내용을 반복한다
	  - 증감값의 위치에 따라 프로그램 실행 결과가 달라질 수 있다
	  
	 */

		public static void main(String[] args) {
			
			int i = 0;
			
			while(i < 10) { 
				// ++i <- 만약 여기에 붙으면 1부터 10까지 나옴
				System.out.println("loop " + i);
				++i;
	
				}
			
			for(int a = 2, b = 1; b <= 9; ++a) {
				System.out.print(a + "x" + b + "=" + a*b + "\t");
				}
			
		
		
			
		}
		}
		
		
	
	

