package create_account;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	CardLayout cl = new CardLayout();
	CreateAccount account = new CreateAccount();
	Login login = new Login();
	public MainFrame() {
		
		setLayout(cl);
		
		add("Create account", account);
		add("Login", login);
		
		setSize(1300, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
