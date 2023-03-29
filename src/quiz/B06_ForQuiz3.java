package quiz;

public class B06_ForQuiz3 {

	/*
	 # for문을 사용해 다음과 같이 숫자를 출력해보세요
	  1. 0 3 6 9 12 ... 93 96 99
	  
	  2. -35 -28 -21 ... 0 7 14 ... 35
	  
	  3. 100 200 300 ... 800 900 1000
	  
	  4. 100 99 98 ... 5 4 3 2 1 0
	  
	  5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ...(30번)
	  
	  6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ...(30번)
	  
	  7. 7 77 777 7777 77777 .... 7777777777(총 10개)	  
	 */
	
	public static void main(String[] args) {
	// 1번. 0 3 6 9 12 ... 93 96 99
		for(int d = 0; d < 100; d += 3) {
			System.out.print(d + " ");		
		}
			System.out.println();
		
	// 2번. -35 -28 -21 ... 0 7 14 ... 35
		for(int e = -35; e <= 35; e += 7) {
			System.out.print(e + " ");
		}
			System.out.println();
		
	// 3번. 100 200 300 ... 800 900 1000
		for(int f = 100; f <= 1000; f += 100) {
			System.out.print(f);
		}
			System.out.println();
		
		
	// 4번. 100 99 98 ... 5 4 3 2 1 0
		for(int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
			System.out.println();
			
	// 5번. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ...(30번)
//		 String str = "0 1 2 3 4 5 6 7 8 9";	      
//	      for(int j = 0; j <= 30; ++j) {
//	         System.out.println(str);
//	      }
	     // 선생님 풀이 : 
	         for(int i = 0; i < 300; ++i) {
	         System.out.print(i % 10 + " ");
	         } 
	         
	     /*
	       <숫자를 거꾸로 세는 방법>
	       for(int i = 0; i < 100; ++i){
	       system.out.print(100 - i + " ");
	       }
	       system.out.println();
	            
	      */
		
    // 6번. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ...(30번)    
		String str2 = "10 9 8 7 6 5 4 3 2 1";
	      for(int b = 0; b <= 30; ++b) {
	         System.out.println(str2);
	      }
	    /* 선생님 풀이 : 
	     for(int i = 0; i < 300; ++i) {
	     System.out.println(10 - (i % 10) + " ");
	     } */     
	   
	// 7번. 7 77 777 7777 77777 .... 7777777777(총 10개)          
	      long num = 7;
	      
	      for(int c = 0; c <= 10; ++c) {
	    	  System.out.println(num + " ");
	    	  num = num * 10 + 7;
	      }
	    String numStr = "7";
	    for(int i = 0; i < 10; ++i) {
	    	System.out.print(numStr + " ");
	    	numStr += "7";
	    }
	}
	
	}

