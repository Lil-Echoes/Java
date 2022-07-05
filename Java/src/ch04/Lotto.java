package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		
		System.out.println("로또 번호 몇개를 조작할까요?");
		int num = sc.nextInt();
		for(int i =0; i < num; i++) {
			System.out.println("로또 번호를 입력하세요");
			lotto[i] = sc.nextInt();
			for(int j = i -1; j >=0; j--) {
				if(lotto[i] == lotto[j]) {
					System.out.print("같은 숫자를 입력하였습니다\n다시 ");
					i--;
					break;
				}
			}
		}
		
		
		int imsi = 0;
		
		for(int i =num; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = i -1; j >=0; j--) {
				if(lotto[i] == lotto[j]) {				// 새로운 로또 번호가 앞에 이미 존재하면 
					i--;								// 새로 뽑은 로또 번호 취소
					break;
				}
			}
		}
		for(int i = num; i < lotto.length; i++) {
			for(int j = i+1; j < lotto.length; j++ ) {
				if(lotto[i] > lotto[j]) {
					imsi = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=imsi;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		sc.close();

	}

}
