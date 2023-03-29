package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S11_GridLayout {

	// 컴포넌트들을 그리드 방식으로 배치할 수 있다
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		// 생성자에 행과 열을 설정한다
		// 3번째 값: 가로 여백, 4번째 값: 세로 여백
		GridLayout layout = new GridLayout(3, 2, 5, 5);
		
		f.setLayout(layout);
		
		for(int i = 0; i < 8; ++i) {
			JButton btn = new JButton("Button" + i);
			
			btn.setSize(100, 100);
			
			f.add(btn);
		}
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
}
