package gui.quiz.register.login.model;

public class PasswordEncryption {

	public static String encrypt(char[] password) {
		
		StringBuilder sb = new StringBuilder(new String(password));
		
		return sb.reverse().toString();
	}
	
}
