package quiz;

public class B10_Gugudan {

	/*
	  1번. 구구단을 다음과 같이 가로로 출력해보세요.
	  
	  2단: 2X1=2  2X2=4 2X3=6 ...
	  3단: 3x1=3  3x2=6 ...
	  4단: ... 
	  
	  
	  2번. 구구단을 다음과 같이 세로로 출력해보세요.
	  2단        3단       4단   ...
	  2X1=2     3X1=3     4x1=4  ...
	  2x2=4     3x2=6     4x2=8  ...
	 */
	
	public static void main(String[] args) {
		
		 // 1번. 구구단을 다음과 같이 가로로 출력해보세요.
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.printf(" %d단: ", dan);
			for(int gop = 1; gop <=9; ++gop) {
			System.out.printf(" %dX%d=%-2d", dan, gop, dan*gop);
			if(gop == 9) {
				System.out.println();
			}
		}
		}
		
	
		
		
		// 2번. 구구단을 다음과 같이 세로로 출력해보세요.
		
		 for(int i = 2; i < 10; ++i) {
	         System.out.print(i + "단      " );
	      }
	      System.out.println();
	
	      for(int b = 1; b <= 9; ++b) {
	         for(int a = 2; a <= 9 ; ++a) {
	         System.out.print(a + "x" + b + "=" + a*b + "\t");
	         if(a == 9) {
	            System.out.println();
	         }
	                    
	      }
	      }
	      }
}
