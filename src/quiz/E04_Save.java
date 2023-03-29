package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E04_Save {
	/*
	 * (1) 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	 * 
	 * (2) 프로그램 종료시 전적을 파일에 저장하고
	 * 
	 * (3) 프로그램 실행 시 파일에 저장된 전적 데이터를 읽어 예전 전적이 그대로 이어지도록 만들어보세요.
	 */

	public static int game() { // 1
		return (int) (Math.random() * 3);
	}

// @return 0 플레이어 승리, 1 무승부, 2 플레이어 패배
	public static void main(String[] args) {

		int[] record = new int[3];

		// 전적을 불러와야 한다 (Load)
		FileInputStream in = null; // 3
		try {
			in = new FileInputStream("myFiles/save.game");

			record[0] = in.read();
			record[1] = in.read();
			record[2] = in.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
			}
		}

		System.out.println("전적: " + Arrays.toString(record));
		System.out.println("게임 시작!");
		for (int i = 0; i < 10; ++i) {
			int result = game();
			System.out.println("결과: " + result);

			record[result] += 1;
		}

		// 전적을 저장하고 마무리 해야한다 (Save) // 2
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("myFiles/save.game");

			// 여기로 전적을 숫자로 저장해도 파일을 보려할 때 문자로 해석한다
			out.write(record[0]);
			out.write(record[1]);
			out.write(record[2]);
		} catch (Exception e) {
			System.out.println("스트림 생성 또는 쓰기 도중 에러 발생");
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				System.out.println("닫기 도중 에러 발생");
			}
		}
	}
}