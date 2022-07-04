package ch04;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		
//		로또 1~45 사이의 난수를 만들어 6개 출력
//		동일한 숫자가 나오면 안된다.
		
		int lotto[] = new int[6];
		
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = i-1; j>=0; j--) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));


	}

}
