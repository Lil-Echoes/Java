package ch14;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageTest1  extends Frame {
	Image img;
	
	public ImageTest1() {
		img = Toolkit.getDefaultToolkit().getImage("lenna.jpg");
		setSize(300,300);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageTest1();
		
	}

}
