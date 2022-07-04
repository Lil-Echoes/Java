package ch04;

public class Ex04 {

	public static void main(String[] args) {
		
//		거스름돈 372000
//		50000원, 10000원, 5000원, 1000원 각각 몇장으로 거슬러줘야하는가
		int[] coinUnit = {50000, 10000, 5000, 1000};
		int money = 372000;
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.printf("%d원 : %d개\n", coinUnit[i], money/coinUnit[i]);
			money %= coinUnit[i];
		}

	}

}
