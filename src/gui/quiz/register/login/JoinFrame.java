package gui.quiz.register.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.register.dao.RegisterDAO;
import gui.quiz.register.login.model.Member;
import gui.quiz.register.login.model.PasswordEncryption;

public class JoinFrame extends JFrame {
	
	JFrame child = this;
	JFrame parent;

// 아이디, 이름, 나이, 주민등록번호 맨 앞자리까지, 관심분야, SMS 수신 동의 여부, 이메일, 핸드폰 번호
	JTextField id_field = new JTextField("abc123") {
		{
			setBounds(50, 50, 200, 30);
		}
	};
	
	JPasswordField pw_field = new JPasswordField("abc123") {
		{
			setBounds(50, 450, 200, 30);
		}
	};

	JTextField name_field = new JTextField("김말이") {
		{
			setBounds(50, 100, 200, 30);
		}
	};
	JTextField age_field = new JTextField("23") {
		{
			setBounds(50, 150, 200, 30);
		}
	};
	JTextField social_number_field = new JTextField("881111-1") {
		{
			setBounds(50, 200, 200, 30);
		}
	};
	JCheckBox soccer = new JCheckBox("축구") {
		{
			setBounds(50, 250, 50, 30);
		}
	};
	JCheckBox basketball = new JCheckBox("농구") {
		{
			setBounds(100, 250, 50, 30);
		}
	};
	JCheckBox movie = new JCheckBox("영화") {
		{
			setBounds(150, 250, 50, 30);
		}
	};
	JCheckBox drama = new JCheckBox("드라마") {
		{
			setBounds(200, 250, 70, 30);
		}
	};
	JCheckBox bike = new JCheckBox("자전거") {
		{
			setBounds(267, 250, 70, 30);
		}
	};

	List<JCheckBox> interest_fields = new ArrayList<>() {
		{
			add(soccer);
			add(basketball);
			add(movie);
			add(drama);
			add(bike);
		}
	};

	JCheckBox sms_box = new JCheckBox("~~에 동의합니다.") {
		{
			setBounds(50, 300, 150, 30);
		}
	};

	JTextField email_field = new JTextField("email@abc.com") {
		{
			setBounds(50, 350, 150, 30);
		}
	};

	JTextField phone_field = new JTextField("1231231234") {
		{
			setBounds(50, 400, 200, 30);
		}
	};

	JButton join_button = new JButton("가입하기") {
		{
			setBounds(50, 500, 100, 30);
			addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 입력값 검증
					if (!fieldValidate()) {
						return;
					}
					// DB에 회원 정보 쓰기
					Member mem = new Member();

					mem.setMem_id(id_field.getText());
					mem.setSms(sms_box.isSelected());
					mem.setPhoneNumber(phone_field.getText());
					mem.setEmail(email_field.getText());
					mem.setMem_name(name_field.getText());
					mem.setAge(Integer.parseInt(age_field.getText()));


					// "881111-1"
					char ch = social_number_field.getText().charAt(7);

					if (ch == '1' || ch == '3') {
						mem.setGender("남");
					} else {
						mem.setGender("여");
					}

					int birth = Integer.parseInt(social_number_field.
							getText().substring(0, 6));

					// java.sql.valueOf(LocalDate) 기능 활용
					// 해당 메서드로 리턴되는 타입은 java.sql.Date이지만
					// java.util.Date의 자식임
					mem.setBirthday(java.sql.Date.valueOf(LocalDate.of(
								(ch <= '2' ? 1900 : 2000) + birth / 10000, 
								birth % 10000 / 100, birth % 100
					)));

//				mem.setPassword();
				List<String> interests = new ArrayList<>();	
				
				for(JCheckBox interest_field : interest_fields) {
					if (interest_field.isSelected()) {
						interests.add(interest_field.getName());
						
					}
				}
				
				// 1개 또는 2개만 선택했을 때 null 채워서 3개 만들기
				while(interests.size() != 3) {
					interests.add(null);
				}
				
				mem.setInterest1(interests.get(0));
				mem.setInterest1(interests.get(1));
				mem.setInterest1(interests.get(2));
				
				String encrypted_password = 
						PasswordEncryption.encrypt(pw_field.getPassword());

				mem.setPassword(encrypted_password);
				
				new RegisterDAO().registerMember(mem); // DB까지 연결됨

				}
			});

		}
	};
	
	JButton cancel_button = new JButton("취소") {
		{
			setBounds(200, 500, 100, 30);
			addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					parent.setVisible(true);
					child.setVisible(true);
				}
			});
		}
	};

	public JoinFrame(JFrame parent) {

		this.parent = parent;

		add(id_field);
		add(name_field);
		add(age_field);
		add(social_number_field);
		add(sms_box);
		add(email_field);
		add(phone_field);
		add(join_button);
		add(cancel_button);
		add(pw_field);

		for (JCheckBox interest_field : interest_fields) {
			add(interest_field);
		}

		setLayout(null);
		setLocation(600, 200);
		setSize(400, 600);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 창이 닫아지지 않음

	}

	public void open() {
		setVisible(true);
		parent.setVisible(false); // 해당 프레임을 숨기는 메서드
	}

	public boolean fieldValidate() {
		return false;
	}

}