package quiz;

public class B11_Continue {

	/*
	  1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
	  
	  2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 출력
	  
	    * while문을 사용해아함
	    * while문 내부에도 break와 continue를 사용할 수 있다
	    
	 */
	
	public static void main(String[] args) {
		
		int line = 0;
		
		int num = 0;
		while(++num <= 30) {
			
			++line;
			
			if(line % 5 == 1)
				System.out.println();
			
			System.out.print(num + " ");

		}
		
		/* 선생님 풀이
		int number = 1;
		while(number <= 30) {
			System.out.println(number++ + "\t");
			if(number % 5 != 1) {
				continue;
			}
			System.out.println();
		}
		*/
		
		int sum = 0;
		int i = 0;
		
		while(i++ <= 200) {
			if(i % 2 == 0 && i % 3 == 0) {
				continue;
				
			}
			sum += i;
			
		}System.out.println(sum);
	
	// 2번 선생님 풀이
		/*
		int a = 1;
		while(a++ <= 200) {
			System.out.println(a);
		if(a % 2 != 0 && a % 3 != 0) {	
			sum += a;
		}
		System.out.println(sum);
		
		*/
		
	}
		
		// while문에서 가장 중요한 것은 증감값의 위치에 따라
		// 숫자가 몇 부터 몇 까지 반복될지 정확히 아는 것
		
		/*
		int i = 0;
		
		while(i++ < 10) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 10이지만 9번 반복하므로 별로인 반복문
		i = 0;
		while(++i < 10) {
			System.out.println();
		}
		
		i = 0;
		while(i < 10) {
			++i;
			System.out.println(i);
		}
		
	*/
	}


