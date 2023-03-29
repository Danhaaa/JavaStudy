package quiz;

import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_ReporterEmailListFile {

	// 기자들의 이메일들로만 이루어진 파일을 생성해보세요.

	public static void main(String[] args) {

		Pattern emailPattern = Pattern.compile("\\S+@\\S+");

		Matcher matcher = emailPattern.matcher(D10_ReporterEmailList.text);

		int i = 0;
		try {
			FileOutputStream out = new FileOutputStream("myFiles/email_list");

			while (matcher.find()) {
				out.write((matcher.group(0) + "\n").getBytes());
			}
			out.close();
		} catch (Exception e) {
			System.out.println("뭔가 문제 생김");
		}
		System.out.println("프로그램 종료");
	}

}