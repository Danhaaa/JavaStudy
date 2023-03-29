package gui.quiz; // 원일씨 클래스

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S14_ChangeImage extends JFrame {
	
	/*
	 	(1) images 폴더에 있는 모든 이미지들을 GridLayout으로 보여주기
	 	
	 	(2) 해당 이미지를 클릭하면 확대된 이미지가 새 창에 나오게 만들기
	 */

	
	public static void main(String[] args) {
		//new S14_ImageGallery("copytest/images/foods/fruits");
		
		int imageCount = 0;
		JFrame f = new JFrame();
		GridLayout layout = new GridLayout(2, 0, 5, 5);
		f.setLayout(layout);
		
		File imageDir = new File("images/");
		
		String[] imagePaths = imageDir.list();
		List<BufferedImage> imageList = new ArrayList<>();
		
			try {
				
				for(String imagePath : imagePaths) {
					if(Pattern.matches("\\S+.jpg", imagePath)) {
						BufferedImage bufferedImage = 
						ImageIO.read(new File("images/" + imagePath));
						imageList.add(bufferedImage);
						imageCount++;
					}
				}
		
				for(BufferedImage bufferedImage : imageList) {
					JButton btn = new JButton();
					btn.setSize(100, 100);
					f.add(btn);
					Image scaledImage =
							bufferedImage.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
					btn.setIcon(new ImageIcon(scaledImage));
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JFrame f = new JFrame();
							JButton btn2 = new JButton();
							Image image = bufferedImage.getScaledInstance(500, 500, Image.SCALE_DEFAULT);
							btn2.setIcon(new ImageIcon(image));
							
							f.setTitle("확대본");
							f.add(btn2);
							f.setVisible(true);
							//f.setLayout(null);
							f.setSize(500, 500);
							f.setLocationRelativeTo(null);
							f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						}
					});
				}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		f.setTitle("과일사진");
		//f.setLayout(null);
		f.setSize(100 * imageCount, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
