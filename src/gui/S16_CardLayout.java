package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 여러 컴포넌트를 달아놓을 수 있지만 한번에 하나만 보여주는 레이아웃
// 카드처럼 원하는 컴포넌트로 넘기면서 사용할 수 있다		

public class S16_CardLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("Card Layout");
		
		JButton next = new JButton(">");
		JButton prev = new JButton("<");
		
		CardLayout card = new CardLayout();
		JPanel panel = new JPanel(card);
		
		// 카드 레이아웃에 컴포넌트 추가 시 이름을 지정하는 것이 좋다
		panel.add("apple", new JLabel("1")); 
		panel.add("car", new JLabel("2")); 
		panel.add("air", new JLabel("3")); 
		panel.add("zoo", new JLabel("4")); 
		panel.add("baseball", new JLabel("5")); 
		
		// 다음 카드로 넘기기
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		// 해당 카드 레이아웃이 설정된 컨테이너의 인스턴스를 함께 전달해야 한다
				card.next(panel); 
			}
		});
		
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			// card.next(panel) : 카드 레이아웃의 다음 컴포넌트를 보여줌
			// card.previous(panel); // 카드 레이아웃의 이전 컴포넌트를 보여줌
			// card.first(panel); // 카드 레이아웃의 첫 번째 컴포넌트를 보여줌
			// card.show(panel, name); : 원하는 컴포넌트를 보여줌 (이름이 필요)
			card.show(panel, "zoo");	
				
			}
		});
		
		
		f.add(next, "East");
		f.add(prev, "West");
		f.add(panel, "Center");
		
		
		f.setLocation(500, 300);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
