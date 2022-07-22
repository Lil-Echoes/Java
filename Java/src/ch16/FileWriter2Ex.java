package ch16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter2Ex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String filename = br.readLine();
		System.out.println("저장할 글을 입력하세요");
		String msg = br.readLine();
		FileWriter fw = new FileWriter(filename);
		fw.write(msg);
		System.out.println("파일 저장 완료");
		fw.close();
		br.close();
		
	}

}
