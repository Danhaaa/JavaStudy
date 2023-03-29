package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_Copy {
	/*
	  images 폴더 내부의 모든 내용을 원하는 경로에 모두 복사해보세요.
	 */
	public static void copyFile(File srcFile, File dstFile) { // 1
		// FileReader in  = null;
		// FileWriter out  = null;
		
		FileInputStream in = null; // 이미지 복사를 위해 
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dstFile);
			
			out.write(in.readAllBytes());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) in.close();
				if(out != null) out.close();
		} catch(IOException e ) { 
			e.printStackTrace();}
	}	
}
	public static void copyDirectory(File src, File dst) throws Exception{
		if(!src.isDirectory()) {
			throw new Exception("디렉토리만 전달해 익셉션");
		}
		if(!src.exists()) {
			throw new Exception("복사할 파일 경로 틀림 익셉션");
		}
		if(!dst.exists()) {
			throw new Exception("목적지 경로 틀림 익셉션");
		}
		
		// src : images
		// dst : myFiles
		// to_copy : myFiles/images/
		File to_copy = new File(dst, src.getName());
		
		// myFiles/images
		to_copy.mkdir(); 
		
		// 원본 폴더인 images/내부의 파일들
		for(File f : src.listFiles()) {
			if(f.isDirectory()) {
				copyDirectory(f, dst); // src는 f가 되고, dst는 to_copy가 됨
			} else if(f.isFile()) {
				copyFile(f, new File(to_copy, f.getName()));
			}
		}
	}
	
	
	public static void copy(File src, File dst) { // 2
		File to_copy = new File(dst, src.getName());
		
		System.out.println("----------------------------------");
		System.out.println("원본의 위치: " + src);
		
		if(src.isDirectory()) {
			to_copy.mkdir();
		}else if(src.isFile()) {
			copyFile(src, to_copy);
		}else {
			System.out.println("?? 복사 종료");
		}
		
	}	
		// src 폴더의 리스트를 본다	

	public static void main(String[] args) {// 3
		try {
		copyDirectory(
				new File("images"), 
				new File("copy_practice"));
		}catch(Exception e) {
		e.printStackTrace();
		}
	}	
}
