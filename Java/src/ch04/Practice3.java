package ch04;

public class Practice3 {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.printf("%d원 : %d개\n", coinUnit[i], money/coinUnit[i]);
			money = money % coinUnit[i];
		}

	}

}
