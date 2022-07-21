package ch13;

import java.awt.Color;
import java.awt.Frame;

public class Frame1 extends Frame {
	public Frame1() {
		setSize(300, 300);
		setBackground(Color.red);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame1();
	}

}
