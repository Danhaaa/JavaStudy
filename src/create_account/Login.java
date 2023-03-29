package create_account;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	CreateAccount ca = new CreateAccount();
			
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton btn1, btn2;
	
	public Login() {
		
		setLayout(null);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la1 = new JLabel("아이디", JLabel.CENTER);
		la1.setBounds(40, 30, 60, 15);
		la1.setHorizontalAlignment(JLabel.LEFT);
		tf = new JTextField();
		tf.setBounds(40, 55, 150, 25);
		
		add(la1); add(tf);
		
		la2 = new JLabel("비밀번호", JLabel.CENTER);
		la2.setBounds(40, 80, 60, 30);
		pf = new JPasswordField();
		pf.setBounds(40, 105, 150, 25);
		
		add(la2); add(pf);
		
		JButton btn1 = new JButton("로그인");
		JButton btn2 = new JButton("회원가입");
		btn1.setBounds(30, 170, 122, 30);
		btn2.setBounds(182, 170, 122, 30);
		
		add(btn1);
		add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ca.setVisible(true);
			}
		});
	
	}
	 public void open() {
	      setVisible(true);
	   }
	
	
	public static void main(String[] args) {
	Login login = new Login();
		login.open();
	
	}
	
}


