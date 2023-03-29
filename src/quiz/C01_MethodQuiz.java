package quiz;

import java.util.Arrays;

public class C01_MethodQuiz {
	 /*
    # 다음 메서드를 정의하고 올바르게 동작하는지 테스트 해보세요
    
     1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
     
     2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
     
     3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
     
     4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
     
     5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
 */	
	
	// 1번. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isAlphabet(char ch) {
		return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'; 
	}
	
	// 2번. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	}
	// 3번. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	public static String evenOdd(int num) {
		return num % 2 == 0? "짝수입니다." : "홀수입니다.";
//		if(num % 2 == 0) {
//			return "짝수입니다.";
//		}else {
//			return "홀수입니다.";
//		}
	}
	
	// 4번. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	public static int[] yaksu(int num) {
		int cnt = 0;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				++cnt;
			}
		}
		int[] yaksu = new int[cnt];
		
		cnt = 0;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				yaksu[cnt++] = i;
			}
		}
			return yaksu;
	}
	
	// 5번. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
		public static boolean isPrime(int num) {
			for (int i = 2; i < Math.sqrt(num); ++i) {
				if(num % i == 0) {
					System.out.println("[INFO]" + i + "로 나누어 떨어져서 소수가 아닙니다.");
					return false;
				}
			}
			return true;
		}
		
	
	public static void main(String[] args) {
		
		boolean english = isAlphabet('가');
		System.out.println("english? " + english);
		System.out.println("english? " + isAlphabet('Z'));
		
		System.out.println("777의 약수: " + Arrays.toString(yaksu(777)));
	 
		// boolean 타입을 리턴하는 메서드는 조건으로 사용할 수 있다
		if(isPrime(333)) {
			System.out.println("소수일 때 도착하는 곳");
		}else {
			System.out.println("소수가 아닐 때 도착하는 곳");
		}
		
	}
		
	}
	
	
	
	

