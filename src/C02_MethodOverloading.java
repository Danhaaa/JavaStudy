
public class C02_MethodOverloading {
/*
  # 메서드 오버로딩 (Method overloading)
  	- 같은 이름의 메서드를 여러개 선언하는 방식
  	- 메서드 매개 변수의 타입 또는 개수가 다르다면 이름이 같아도
  	  각 메서드를 구분할 수 있기 때문에 중복 선언이 가능하다

 */
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	// 매개 변수의 개수가 다르다면 같은 이륾의 메서드를 선언할 수 있다
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int plus(int ... nums) {//개수가 몇개 들어올지 모를때 ...사용
		int sum = 0;
		for(int i = 0; i < nums.length; ++i) {
			sum += nums[i];
		}
		return sum;
	}
	
	
	// 매개 변수의 개수가 같아도 타입이 다르다면 다른 메서드로 인식할 수 있다
	public static float plus(float a, float b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		plus(1, 2, 3);
		plus(1.2f, 2.3f);
		
		
	}
	
	
}
