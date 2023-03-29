import java.util.Scanner;

public class A00____ {

	/*
	  사용자가 문장을 입력하면 입력한 문장의 소문자는 모두 대문자로,
	  대문자는 모두 소문자로 바꿔서 출력해주세요.
	  (알파벳에 해당하지 않으면 그대로 출력)
	   
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String text = sc.nextLine();
		
		
		System.out.println(text.length());
	}
	
}
