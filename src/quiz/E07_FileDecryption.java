package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E07_FileDecryption {
	/*
	 * 암호화 된 파일의 맨 위부터 50줄을 모든 키값(1 ~ 25)으로 복화한 샘플을 보여준 후 
	 * 사용자가 샘플을 보고 key값을 선택할 수 있도록 만들고 선택하면 해당 키값으로 복호화한 
	 * frankenstein_decrpted.txt가 생성되도록 만들어보세요.
	 */

	public static void printSample(File crypto) {
		try (FileReader fin = new FileReader(crypto);
			BufferedReader in = new BufferedReader(fin);) {
			StringBuilder sampleSrc = new StringBuilder();

			for (int i = 0; i < 10; ++i) {
				sampleSrc.append(in.readLine());
				sampleSrc.append('\n');

			}

			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(0);
			for (int key = 1; key <= 25; ++key) {
				cryptoTool.setKey(key);
				System.out.printf("###key %d ###\n", key);
				System.out.println(cryptoTool.decrypt(sampleSrc.toString()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//		public void setKey(int key) { -> 이 부분은 D09_CaesarCipher에 추가함
//			this.key = key;
//		}		

	public static void main(String[] args) {

		// InputStream을 Reader로 업그레이드하는 클래스
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		File target = new File("myFiles/frankenstein_encrypted.enc");

		printSample(target);

		while (true) {
			try {
				System.out.println("원하는 key를 입력 >> ");
				String line = in.readLine();

				int key = Integer.parseInt(line.trim());

				// decryptFile(target, key);

				break; // 입력이 되면 break
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("key는 숫자로 입력해주세요");
			}
		}
		System.out.println("복호화 파일이 생성되었습니다.");
		/*
		 * #Stream에 대한 close를 반드시 해야 하는 이유
		 * 
		 * - 사실 모든 참조형 변수는 close가 필요하다 - 하지만 일반적으로 참조형 변수의 닫는 타이밍은 뻔하기 때문에 자동으로 닫아주는
		 * 프로그램(Garbage Collector)이 알아서 닫는다 - 하지만 Stream등 닫는 타이밍이 뻔하지 않은 클래스들은 자동으로 닫아주지
		 * 않는다 - 만약 계속 닫지 않으면 결국 메모리가 가득 차서 프로그램이 운영체제에 의해 강제 종료된다
		 * 
		 */

		try {
			if (in != null)
				in.close();
			if (isr != null)
				isr.close();
		} catch (IOException e) {
			System.out.println("close 도중 에러 발생 (한번도 본적 없음)");
		}
	}
}

