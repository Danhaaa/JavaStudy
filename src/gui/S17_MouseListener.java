package gui;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S17_MouseListener {

	// 마우스 이벤트 처리
	
	// MouseListener : 인터페이스
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Mouse Event!!");
		
		f.setLayout(new GridLayout(2, 1));
		
		JButton top = new JButton("위");
		JLabel bottom = new JLabel("아래");
		
		
// 모든 컴포넌트에는 버튼이 아니더라도 사용할 수 있는 공통 이벤트들이 있다
		bottom.addMouseListener(new MouseAdapter() {
			// 인터페이스, 모든 추상 메서드를 구현해야해서 불편
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 이벤트 발생 시 e에 이벤트 정보가 실려서 도착함
				
				System.out.println(e.getClickCount()); 
				// 몇 번 눌렀는지 숫자도 같이 출력
				System.out.println("아래쪽에서 마우스 클릭됨");
				// 마우스가 아니어도 아래를 누르면 콘솔에 뜸
				System.out.printf("마우스 좌표(프로그램에서): (%d, %d)\n",
						e.getX(), e.getY());
				System.out.printf("마우스 좌표(모니터상에서): (%d, %d)\n",
						e.getXOnScreen(), e.getYOnScreen());
				
			// 이벤트를 발생시킨 컴포넌트의 인스턴스 (컴포넌트 타입이므로 다운캐스팅이 필요)
				System.out.println(((JLabel)e.getComponent()).getText());
				
				System.out.println("누른 시간: " + new Date(e.getWhen()));
				
			}
		});	
		
		f.add(top);
		f.add(bottom);
		
		f.setLocation(500, 300);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
