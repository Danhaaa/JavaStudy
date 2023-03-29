package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

public class S20_JPopupMenu {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Popup Menu!!");
		
		JPopupMenu popup = new JPopupMenu("popup");
		
		JMenu src = new JMenu("src....");
		
		JSeparator sep = new JSeparator();
		
		// JpopupMenu에 JMenu로 서브 메뉴 등록하기
		src.add(new JMenuItem("Generte Getters"));
		src.add(new JMenuItem("Generate Setters"));
		
		JMenuItem[] items = new JMenuItem[5];
		
		for (int i = 0; i < items.length; ++i) {
			items[i] = new JMenuItem("item" + (i + 1));
			popup.add(items[i]);
		}
		
		popup.add(sep);
		popup.add(src);
		
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// Alt + 우Click 하면 발동
				if (e.isAltDown() && e.getButton() == 3) {
					popup.show(f, e.getX(), e.getY());
				}
			}
		});
		
		f.setLocation(500, 300);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
