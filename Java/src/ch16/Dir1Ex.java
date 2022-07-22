package ch16;

import java.io.File;

public class Dir1Ex {
	
	public static void main(String[] args) {
		
//		File dir = new File(".");
//		File dir = new File("./src/ch12");
//		File dir = new File("src/ch02");		//상대 경로
		
		File dir = new File("C:\\Java\\JavaSrc\\Github\\Java\\src\\ch12");		// 절대경로
		String[] strs = dir.list();
		for(String str:strs) {
			System.out.println(str);
		}
		
	}

}
