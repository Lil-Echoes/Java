package ch03;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		int num = 0;
		do {
			System.out.println("문자를 입력하세요");
			str = sc.nextLine();	// 정수 부분까지만 읽고 enter 무시
			System.out.println("입력한 문자 : " + str);
			if (str.equals("x"))
				break;				// 반복문 종료
			System.out.println("숫자를 입력하세요");
//			num = sc.nextInt();		// 숫자까지만 읽고 enter 무시
			num = Integer.parseInt(sc.nextLine());
			System.out.println("입력한 정수 : " + num);
//			sc.nextLine();

		} while(true);
		System.out.println("프로그램 종료");
		sc.close();

	}

}