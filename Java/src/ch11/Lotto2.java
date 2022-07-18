package ch11;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> lotto = new TreeSet<>();
		
		System.out.println("로또 - 몇개의 번호를 고정할까요?");
		int cnt = sc.nextInt();
		
//		로또 번호의 총 수량은 6개 이기에 그 이외의 숫자를 입력하면 안내메세지 출력 후 숫자 재입력
		while (cnt>6 || cnt<0) {
			System.out.println("잘못된 번호입니다\n다시 번호를 입력하세요");
			cnt = sc.nextInt();
		}
		
		while (lotto.size() < cnt) {
			System.out.println("번호를 뭘로 할까요?");
			int num = sc.nextInt();
				if (num > 45 || num < 1) System.out.println("로또 번호로 타당하지 않습니다");
				else if (!lotto.add(num)) {				// 중복 번호를 입력하면 안내메세지 출력 후 숫자 재입력
					System.out.println("중복 번호를 입력했습니다.\n다시 입력해주세요.");
				};
				
		}
			
		while (lotto.size() < 6) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
		sc.close();
	}

}
