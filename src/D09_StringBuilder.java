
public class D09_StringBuilder {
/*
  # StringBuilder 
  
  - 문자열을 빠르게 조립할 때 사용하는 클래스(+= 보다 훨씬 빠르다)
  - 문자열을 생성할 때 필요한 다양한 기능들이 들어있다
  
 */
	
	public static void main(String[] args) {
		String str1 = "";
		
		str1 +="a"; // 계속 새로운 인스턴스가 만들어지는 것
		str1 +="p";
		str1 +="p";
		str1 +="l";
		str1 +="e";

		System.out.println(str1);
		
		StringBuilder sb1 = new StringBuilder();
		
		// append() : +=과 같음
		sb1.append("a"); // 하나의 인스턴스에 값을 추가하는 것
		sb1.append("p");
		sb1.append("p");
		sb1.append("l");
		sb1.append("e");
		
		// insert(offset, anything) : 원하는 위치에 원하는 내용을 끼워넣는다
		sb1.insert(2, "banana"); // 아직도 문자열 수정 가능하다는 뜻
		
		System.out.println(sb1); 
		
		// reverse() : 모든 내용을 거꾸로 바꿈
		sb1.reverse();
				
		System.out.println(sb1);
		
		// subString(start, end) : 원하는 만큼의 String 인스턴스를 반환
		String substr1 = sb1.substring(0, 5);
		String substr2 = sb1.substring(5, 10);
		
		System.out.println(substr1);
		System.out.println(substr2);
		
		// setLength(len) : 만들던 문자열의 길이를 강제로 변경
		sb1.setLength(8);
		System.out.println(sb1);
		
		// setCharAt(index, ch) : 원하는 위치의 문자를 변경
		sb1.setCharAt(0, 'Z');
		System.out.println(sb1);
		
		// replace(start, end, after) : 원하는 만큼의 문자열을 다른 문자열로 교체한다 
		sb1.replace(3, 5, "xx");
		System.out.println(sb1);
		
		// delete(start, end) : 원하는 만큼의 문자열을 삭제한다
		sb1.delete(3, 10);
		System.out.println(sb1);
		
		// delecteCharAt(index) : 원하는 위치의 문자를 하나 삭제
		sb1.deleteCharAt(0);
		System.out.println(sb1);
		
		String BuildResult = sb1.toString();
		System.out.println(BuildResult);
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder test2 = new StringBuilder();
		
		for(int i = 0; i < 100000; ++i) {
			test2.append((char)('a' + i % 26));
			
			if(i % 20 == 19) {
				test2.append("\n");
			}
		}
		System.out.println("실행 시간2: " + 
		(System.currentTimeMillis() - startTime) + "ms");
	//	System.out.println(test2);
	}
}
