package ch03;

public class While3 {

	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		
//		1부터 10까지의 합
		while(i <= 10) {
			sum +=i;		// sum = sum + i;
			System.out.printf("%d까지의 합은 %d이다.%n", i, sum);
			i++;
		}
		
		System.out.printf("1부터 10까지의 합은 %d이다.", sum);

	}

}
