package quiz;

import java.util.Scanner;

public class B00_CelToFahr {
	/*
	  사용자로부터 섭씨(℃) 온도를 입력받으면 화씨(℉)로 몇도인지
	  알려주는 프로그램을 만들어보세요
	  (온도 변환 공식은 구글링 할 것)
	 
	 */
	
	public static void main(String[] args) {
		Scanner tempScanner = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요 >> ");
		double cel = tempScanner.nextDouble();
		
		System.out.println("화씨는 "+ (cel*9/5+32));
		
		// double celcius, fahrenheit;
		// fahrenheit = celcius*9/5+32;
		// System.out.printf("섭씨 %.1f는 화씨 %1f입니다.\n", 
		//		celcius,fahrenheit);
		
	}
	
	
}
