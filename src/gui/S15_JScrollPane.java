package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class S15_JScrollPane {

	/*
	  JScrollPane에 붙이는 컴포넌트는 스크롤이 가능해진다 
	 */
	
	public static void main(String[] args) {
		JFrame f = new JFrame("ScrollPane Test");
		
		f.setLayout(new GridLayout(2, 2));
		
		for(int i = 0; i < 3; ++i) {
			f.add(new JButton("" + i));
		}
		
		// Pane1 : 다른 컴포넌트를 붙일 수 있는 컴포넌트 (레이아웃 설정할 수 있음)
		// Pane : 다른 컴포넌트를 붙일 수 있는 컴포넌트 (특이한 기능이 있음)
		JTextArea textarea = new JTextArea();
		JScrollPane ScrollablePane = new JScrollPane();
		
		
		// JScrollPane에는 컴포넌트 설정할 때는 
		// add 대신 setViewportView() 메서드를 사용한다 (또는 생성자)
		ScrollablePane.setViewportView(textarea);
		
		f.add(ScrollablePane);
		
		f.setLocation(500, 300);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
