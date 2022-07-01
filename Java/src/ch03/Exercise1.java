package ch03;

public class Exercise1 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
				i++;
			}
		}
				System.out.printf("2또는 3의 배수를 제외하고 20까지의 합계는 %d이다",sum);

	}

}
