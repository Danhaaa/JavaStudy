import java.io.FileInputStream;

public class E04_FileInputStream {

	public static void main(String[] args) {

		try {
			FileInputStream in = new FileInputStream("myFiles/test2.txt");
			// out말고 in을 넣으면 test2.txt파일에 한글 입력 후 F11 누르면 이 클래스 in으로 
			// 들어온 후 출력됨

			// read() : 데이터를 한 바이트씩 읽는다. 
			//			더 이상 읽을게 없는 경우 -1을 리턴(EOF, End of File)
			//			한 바이트씩 읽기 때문에 한글 등의 2바이트 문자를 읽기가 힘들다
//			int result = 0;
//			while(true) {
//				result = in.read();	
//				if(result == -1) {
//					break;
//				}
//				System.out.println((char)result);
//			}
			
			// 파일의 모든 내용을 한번에 byte[]로 읽기
			byte[] allData = in.readAllBytes();
			
			// byte[]을 요구하는 문자열 생성자로 재구성하기
			System.out.println(new String(allData)); // new String이 allDate를 합쳐줌		
			
			// 더 이상 안쓸거라면 close
			in.close();
		} catch (Exception e) {
			System.out.println("뭔가 문제 생김");
		}
		System.out.println();
		System.out.println("프로그램 끝");
	}
}
