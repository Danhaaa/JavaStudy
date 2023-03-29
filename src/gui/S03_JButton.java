package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton("Main");
	JButton subBtn = new JButton("Sub Button");


	public S03_JButton() {
		super("JButton 테스트"); // JFrame의 생성자, 부모를 부름
	
		add(mainBtn, "South"); // this.add.this 생략가능
		add(subBtn, "Center");
		
		// 버튼 텍스트 설정
		mainBtn.setText("Hello!");
		subBtn.setText("안녕하세요!");
		
		// 글꼴 설정
		mainBtn.setFont(new Font("궁서체", Font.BOLD, 55));
		subBtn.setFont(new Font("굴림체", Font.PLAIN, 30));
		
		// 버튼의 글씨 색 변경
		subBtn.setForeground(Color.red);
		
		// 버튼의 배경 색 변경
		subBtn.setBackground(new Color(31, 236, 255)); // 0,0,0은 검정배경
		// 구글에 color picker라고 검색하면 나옴
		
		// 버튼의 이벤트 설정 (버튼에 액션 리스너 추가) -> 버튼을 누를때마다 출력됨
		subBtn.addActionListener(new ActionListener() {
			int num;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 눌렸을 때의 동작을 설정할 수 있음
				System.out.println("Hello, Button Event!!");
				mainBtn.setText("<html>" + num++ + "번째 <br> 눌림</html>");
			}
		});
		
		
		
		// Attribute : 속성
		/*
		 	family : 글꼴
		 	weight : 글씨 무게 (굵기)
		 	width : 너비
		 	posture : ?
		 	size : 크기 
		 	transform : 방향 회전
		 	superscript : ?
		 	char_replacement : ?
		 	foreground : 글씨색
		 	background : 배경색
		 	underline : 밑줄
		 	strikethrough : 줄 긋기
		 	run_direction: ?
		 	bidi_embedding: ?
		 	justification : 정렬
		 	input method highlight: ? 
		 	input method underline: ?
		 	swap_colors: ?
		 	numeric_shaping: ?
		 	kerning : ?
		 	ligatures : ?
		 	tracking : ? 
		  
		  
		 */
		
		HashMap<TextAttribute, Object> attributeMap = new HashMap<>();
		
		attributeMap.put(TextAttribute.FONT, "굴림체");
		attributeMap.put(TextAttribute.SIZE, 30);
		attributeMap.put(TextAttribute.STRIKETHROUGH, true);
		attributeMap.put(TextAttribute.TRANSFORM, true);
		attributeMap.put(TextAttribute.FOREGROUND, "Red");
		
		subBtn.setFont(new Font(attributeMap));
		
		setVisible(true); // 출력 시 프레임이 보이게 함
		setBounds(100, 100, 500, 500); // 위치와 크기를 지정함
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}	
	public static void main(String[] args) {
				
		new S03_JButton(); // extends JFrame 로 새로운 방식, 여러 개 인스턴스 찍기 가능

		
	}
	
}
