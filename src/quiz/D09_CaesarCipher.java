package quiz;

public class D09_CaesarCipher {
/*
  # 시저 암호
  
   - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 방식
   - 키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고
   	 암호문을 다시 왼쪽으로 키 값만큼 밀어주면 복호화가 된다
   	 
   	 ABCDEFGHIJKLMNOPQRSTUVWXYZ
   	 
   	 		key가 5일때
   	 HELLO ------------> MJQQT 
 */
		
		private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		private final static String LOWER_CHARSET = "abcdefghujklmnopqrstuvwxyz";
		
		private final static String KOR_CHARSET = getKorSet();
		
		// private final static korCharSet;
		
		int key;
		
		public D09_CaesarCipher(int key) {
			this.key = key;
		}
		
		public static String getKorSet() {
			StringBuilder sb = new StringBuilder();
			
			for(char i = '가'; i <= '힣'; ++i) {
				sb.append(i);
			}
			return sb.toString();
		}
		
		public void setKey(int key) {
			this.key = key;
		}
		
		
		
		public String encrypt(String plain) {
			StringBuilder sb = new StringBuilder(plain);
			
			int len = sb.length();
			
			for(int i = 0; i < len; ++i) {
					char ch = sb.charAt(i);
					int index, len2;
				
				if(Character.isUpperCase(ch)) {
					len2 = UPPER_CHARSET.length();
					index = ch - 'A' + key % len2;
					index = index >= len2 ? index - len2 : index;
					ch = UPPER_CHARSET.charAt(index);
				}else if(Character.isLowerCase(ch)) {
					len2 = LOWER_CHARSET.length();
					index = ch - 'a' + key % len2;
					index = index >= len2 ? index - len2 : index;
					ch = LOWER_CHARSET.charAt(index);
				}else if(ch >= '가' && ch <= '힣') {
					len2 = KOR_CHARSET.length();
					index = ch - '가' + key % len2;
					index = index >= len2 ? index - len2 : index;
					ch = KOR_CHARSET.charAt(index);
				}
				
				sb.setCharAt(i, ch);
				
			}
			
			return sb.toString();
		}
		
		public String decrypt(String crypto) {
			StringBuilder sb = new StringBuilder(crypto);
			int len = sb.length();
			
			for(int i = 0; i < len; ++i) {
				char ch = sb.charAt(i);
				
			if(Character.isUpperCase(ch)) {
				ch -= key % 26;
				ch = (char)(ch < 'A' ? ch + 26 : ch);
			}else if (Character.isLowerCase(ch)) {
				ch -= key % 26;
				ch = (char)(ch < 'a' ? ch + 26 : ch);
			}else if(ch >= '가' && ch <= '힣') { // 한글 복호화 구현
				
			}
			
				sb.setCharAt(i, ch);
			}
				return sb.toString();
		}
		
	public static void main(String[] args) {
		
		String plainText = "Hello, world !! 감사합니다. 땡큐";
		
		D09_CaesarCipher cipher1 = new D09_CaesarCipher(10);
		D09_CaesarCipher cipher2 = new D09_CaesarCipher(13);
		
		System.out.println("key 10: " + cipher1.encrypt(plainText));
		System.out.println("key 13: " + cipher1.encrypt(plainText));
		
		String crypto1 = "Rovvy, gybvn !!";
		
		System.out.println(cipher1.decrypt(crypto1));
		
	
	}
}
