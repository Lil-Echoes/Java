package ch03;

import java.io.IOException;

public class Do3 {

	public static void main(String[] args) throws IOException {
		
		int num = 1;		// 짝수를 입력하세요
		
		do {
			System.out.println("짝수를 입력하세요");		// 5 + enter(CR+LF)
//			CR carriage return 커서를 앞으로 가라 \r
//			LF line feed 줄바꿈 \n
			num = System.in.read() - '0';			// 5+\r+\n
			System.in.read();	// \r	CR처리
			System.in.read();	// \n	LF처리
		} while(num % 2 != 0);		
		
		System.out.println("입력한 짝수 : " + num);

	}

}
