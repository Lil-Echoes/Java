package ch03;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int ran = (int)(Math.random() * 100) + 1;
				int num = 0, cnt = 0;
				do {
					System.out.println("숫자를 맞춰 보세요");
					num = sc.nextInt();
					if (num > ran) System.out.printf("%d보다 작은 수를 입력하세요 \n", num);
					else if (num < ran) System.out.printf("%d보다 큰 수를 입력하세요 \n", num);
					cnt++;
				} while(ran != num);
				System.out.println("숫자 " + num + "울 " + cnt + "번에 맞췄습니다");
				sc.close();

	}

}
