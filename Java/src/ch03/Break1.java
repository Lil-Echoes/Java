package ch03;

public class Break1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			sum += i;
			System.out.printf("%d일 때 %d \n", i, sum);
			if(i > 50) break;
		}
		System.out.println("합계 : " + sum);

	}

}
