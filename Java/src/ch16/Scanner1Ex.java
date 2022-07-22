package ch16;

import java.util.Scanner;

public class Scanner1Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("주소를 입력하세요");
		String address = sc.nextLine();
		System.out.printf("%s님 방가 !!! %s에 사시는군요", name, address);
		sc.close();
	}

}
