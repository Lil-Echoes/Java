package ch14;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

public class ImgTest2 extends Frame {
	Image img;
	
	public ImgTest2() {
		String str = "https://play-lh.googleusercontent.com/F5LUqjCap1mtiM_5vte_ekMJI6nxhYjEXLAjc3JDh1BA4l6XbNQJ_6mAxIQ1Pdayjw";
				try {
					URL url = new URL(str);
					img = Toolkit.getDefaultToolkit().getImage(url);
				} catch (MalformedURLException e) {}
				
				setSize(700,700);
				setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
public static void main(String[] args) {
	new ImgTest2();
}
}
