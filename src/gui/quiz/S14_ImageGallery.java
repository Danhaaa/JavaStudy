package gui.quiz;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S14_ImageGallery extends JFrame{
	/*
	   (1) image 폴더에 있는 모든 이미지들을 GridLayout으로 보여주기
	   
	   (2) 해당 이미지를 클릭하면 확대된 이미지가 새 창에 나오게 만들기
	   
	     
	 */

public S14_ImageGallery(String path) {
	
	File dir = new File(path);
	
	// 모든 ThumbnailButton에서 사용할 viewImageFrame을 하나 생성하여 전달
	ThumbnailButton.setViewFrame(new ViewImageFrame());

	int imageCount = 0;

	for(File f : dir.listFiles()) {
		if(f.isFile()) {
		add(new ThumbnailButton(f));
		++imageCount;
	}
}	
	
	while(imageCount++ < 16) {
		add(new JButton("empty"));
	}
	
	setLayout(new GridLayout(4,4));
	setTitle("Thumbnails");
	setLocation(200,200);
	setSize(500, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}

public static void main(String[] args) {
	new S14_ImageGallery("images/");
}

}
