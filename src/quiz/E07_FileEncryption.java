package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_FileEncryption {
	/*
	 * frankenstein.txt를 시저 암호 방식으로 
	 * 암호화한 파일 frankenstein_encrypted.enc을 생성해보세요.
	 */
	public static File encryptFile(File f, int key) throws Exception{
		if(!f.isFile()) {
			throw new Exception("파일이 아닌 것은 암호화 할 수 없음");
		}else if(!f.getName().endsWith(".txt")) {
			throw new Exception(".txt 파일만 암호화 할 수 있음");
		}
		
		File encrytedFile = new File(f.getParentFile(), 
				f.getName().replaceAll("[.].+", "_encrypted.enc"));
		
		try(
			FileReader fin = new FileReader(f);
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout = new FileWriter(encrytedFile);
			BufferedWriter out = new BufferedWriter(fout);
		) {
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);
			
			String line;
			while ((line = in.readLine()) != null){
			out.append(cryptoTool.encrypt(line));
			out.append("\n");
		}
	}	
		return encrytedFile;
	}	
		
//		System.out.println(f);
//		System.out.println(f.isFile());
//		System.out.println(f.getName()); 
//		System.out.println(f.getParentFile()); 
		
		// replace(old, new): 문자열 치환
		// reaplaceAll(regex, new): 정규표현식을 이용한 치환
		
	public static void main(String[] args) {
		try {
		encryptFile(new File("myFiles/frankenstein.txt"), 10);
	}catch(Exception e) {
		e.printStackTrace();
	}
		System.out.println("프로그램 종료.");
	}	
}	
	
	
	
	
	
	/*
	private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final static String LOWER_CHARSET = "abcdefghijklmnopqrstuvwxyz";


	int key;

	public E07_FileEncryption(int key) {
		this.key = key;
	}

	public static String read() {
		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();

		try {
			FileReader fin = new FileReader(book);
			BufferedReader in = new BufferedReader(fin);

			// readLine() : BufferedReader에 추가된 한 줄씩 읽는 기능
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}

			// 최근에 열었던 순서대로 닫아야 한다
			in.close();
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
	
	private static String allText = read();
	

	public String write() {
		FileWriter out = null;
		try {
				out = new FileWriter("myFiles/frankenstein_encrypted.enc");
			
			int len = allText.length();
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < len; ++i) {
				char ch = allText.charAt(i);
				int index, len2;
				
				if(Character.isUpperCase(ch)) {
					len2 = UPPER_CHARSET.length();
					index = ch - 'A' + key % len2;
					index = index > len2 ? index - len2 : index;
					ch = UPPER_CHARSET.charAt(index);
					
				}else if(Character.isLowerCase(ch)) {
					len2 = LOWER_CHARSET.length();
					index = ch - 'a' + key % len2;
					index = index > len2 ? index - len2 : index;
					ch = LOWER_CHARSET.charAt(index);
				}
			
				sb.setCharAt(i, ch);
			}
			
			return sb.toString();
		}
		
	*/
		
		
	

