package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		
//		로또 1~45 사이의 난수를 만들어 6개 출력
//		동일한 숫자가 나오면 안된다.
//		입력한 값을 받아 원하는 만큼의 숫자를 고정한다 (로또 조작)
		
		Scanner sc = new Scanner(System.in);
		
		int lotto[] = new int[6];
		System.out.println("로또 번호를 몇개 조작할까요?");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("번호를 입력하세요");
			lotto[i] = sc.nextInt();
			for(int j = i-1; j>=0; j--) {
				if(lotto[i] == lotto[j]) {
					System.out.print("같은 번호를 입력하였습니다\n다시 ");
					i--;
					break;
				}
			}
		}
		
		for(int i = num; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = i-1; j>=0; j--) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		sc.close();
	}

}
