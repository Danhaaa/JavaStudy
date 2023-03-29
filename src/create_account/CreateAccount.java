package create_account;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CreateAccount extends JFrame{
	
	JLabel la1, la2, la3, la4, la5, la6, la7, la8;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JPasswordField pf;
	JRadioButton rb1, rb2;
	JButton b1;
	
	 JComboBox interest = new JComboBox();
	 
	 JRadioButton agree = new JRadioButton();
	 JRadioButton disagree = new JRadioButton();
	 
	 JButton button = new JButton("회원가입");
	
	 // D10_CheckPassWord 참고해서 비번 유효성 검사 확인하기

	public CreateAccount() {
		
	
		
		
		la1 = new JLabel("아이디", JLabel.CENTER);
		la1.setBounds(30, 30, 60, 30);
		add(la1);
		
		la2 = new JLabel("비밀번호", JLabel.CENTER);
		la2.setBounds(40, 80, 60, 30);
		add(la2);
		
		la3 = new JLabel("나이", JLabel.CENTER);
		la3.setBounds(30, 130, 60, 30);
		add(la3);
		
		la4 = new JLabel("주민등록번호", JLabel.CENTER);
		la4.setBounds(190, 130, 100, 30);
		add(la4);
		
		la5 = new JLabel("이메일", JLabel.CENTER);
		la5.setBounds(30, 190, 60, 30);
		add(la5);
		
		la6 = new JLabel("핸드폰 번호", JLabel.CENTER);
		la6.setBounds(190, 190, 100, 30);
		add(la6);
		
		la7 = new JLabel("관심분야", JLabel.CENTER);
		la7.setBounds(40, 250, 60, 30);
		add(la7);
		
		la8 = new JLabel("SNS 수신 동의 여부", JLabel.CENTER);
		la8.setBounds(30, 320, 130, 10);
		add(la8);
	
		
		
		tf1 = new JTextField();
		tf1.setBounds(40, 55, 150, 25);
		add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(40, 110, 150, 25);
		add(tf2);
		
		pf = new JPasswordField();
		pf.setBounds(40,160, 60, 25);
		add(pf);
		
		tf4 = new JTextField();
		tf4.setBounds(200,160, 150, 25);
		add(tf4);
		
		tf5 = new JTextField();
		tf5.setBounds(40,220, 150, 25);
		add(tf5);
		
		tf6 = new JTextField();
		tf6.setBounds(200,220, 150, 25);
		add(tf6);
		
		interest.addItem("헬스");
		interest.addItem("게임");
		interest.addItem("영화");
		interest.addItem("음악감상");
		interest.addItem("게임");
		interest.addItem("등산");
		
		interest.setBounds(40, 280, 150, 25);
		add(interest);
		
		agree.setText("동의");
		disagree.setText("거부");
		
		agree.setBounds(35, 330, 150, 30);
		disagree.setBounds(35, 350, 150, 30);
		
		
		ButtonGroup btngp = new ButtonGroup();
		btngp.add(agree);
		btngp.add(disagree);
		
		add(agree);
		add(disagree);
		
		button.setBounds(130, 400, 110, 30);
		add(button);
		
		setLayout(null);
		setSize(400, 500);
		// setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	
}	
	
	
	
	
