package gui.quiz.gugudan.component;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class GugudanButton extends JButton {
	
	
	private int dan = 2;
	private int gop;
	
	public GugudanButton(int i) {
	
	gop = i;
	setFont(new Font(null, Font.PLAIN, 30));
    setText(String.format("2 X %d = %d", i, i * 2));
    setBounds(0, (i - 1) * 55, 500, 55);
    setBackground(Color.WHITE);
    
	}
	public void plusDan() {
		if(dan == 19) {
			dan = 1;
		}
		
		setText(String.format("%d x %d = %d", ++dan, gop, gop * dan));
	}
	
	public void minusDan() {
		if(dan == 1) {
			dan = 19;
		}
		
		setText(String.format("%d x %d = %d", --dan, gop, gop * dan));
	
	}
}
