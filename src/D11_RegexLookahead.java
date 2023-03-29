import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_RegexLookahead {
/*
  # 정규표현식 Lookahead
  	- 특정 정규표현식 앞에 있는 패턴을 자아낼 수 있는 방식
  	- 잘 응용하면 반드시 포함시키는 규칙을 만들어낼 수 있다
  	
  	apple(?=regex)  : regex 앞에 있는 apple를 찾아라 
  	apple(?!regex)	 : regex 앞에 오지 않는 apple를 찾아라
  	apple(?<=regex) : regex 뒤에 오는 apple를 찾아라
  	apple(?<!regex) : regex 뒤에 오지 않는 apple를 찾아라
 */
	public static void main(String[] args) {
		
		// step 1
		String text = "apple@ @apple apple@ @apple apple@ @apple";
		
		Pattern frontApple = Pattern.compile("apple(?=@)");
		
		Matcher frontMacher = frontApple.matcher(text);
		
		while(frontMacher.find()) {
			System.out.println("found:" + frontMacher.group());
			System.out.println("start: " + frontMacher.start());
			System.out.println("end: " + frontMacher.end());
		}
		// step 2
		String text2 = "apple";
		String frontRegex2 = "app(?=1)e"; // 안됨
		String frontRegex2_1 = "app(?=1)le"; // 됨
		
		System.out.println("# test2");
		System.out.println(Pattern.matches(frontRegex2, text2));
		
		// step 3
		String text3 = "Hello, abcd1234!!! 3 4 5 6 78910 123 2 1333";
		
		String frontRegex3 = "(?=\\d)[1-3]{2,}.";
		
		Pattern pattern3 = Pattern.compile(frontRegex3);
		
		Matcher matcher3 = pattern3.matcher(text3);
		
		System.out.println("# test3\n");
		while(matcher3.find()) {
			System.out.println("found: " + matcher3.group());
			System.out.println("start: " + matcher3.start());
			System.out.println("end: " + matcher3.end());
			System.out.println("------------------------------");
		}
		
		// step 4
		String text4 = "a124";						 // acb579
		String frontRegex4 = "(?=a\\d)[a1-4]{3,}";   // b(?=5
		// 글자를 소모하지 않아 맨 앞부터 검사하므로 3글자 true 
		String frontRegex4_1 = "a(?=\\d)[1-4]{3,}";   //[1-3][2-4]
		// a 뒤부터 3글자여야 하므로 false
		
		System.out.println(Pattern.matches(frontRegex4, text4));
		System.out.println(Pattern.matches(frontRegex4_1, text4));
		
		// step 5
		String text5 = "AC2ABCDfa#";
		String frontRegex5 = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])[\\dA-Za-z!@#$%]{6,}"; 
		
		System.out.println("\n# test5\n");
		System.out.println(Pattern.matches(frontRegex5, text5));
		
	}
}
