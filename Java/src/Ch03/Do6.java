package Ch03;

public class Do6 {

	public static void main(String[] args) {
		
//		do ~ while을 이용하여 구구단 출력(2 ~ 9단)
		int i = 1, j = 2;
		System.out.println(" 구구단");
		System.out.println("=======");
		
		do {
			do {
				System.out.printf("%d * %d = %d \t", j, i, i*j);
				j++;
			} while (j <=9);
			System.out.println();
			i++;
			j=2;
		} while(i <= 9);

	}

}
