package ch03;

public class Exercise2 {

	public static void main(String[] args) {
		
		int sum = 0, totalsum = 0;
		
		for (int i = 1; i <=10; i++) {
				sum += i;
				System.out.println(i + "까지 합계 : " +sum);
				totalsum +=sum;
		}
		System.out.println("합계 : " + sum);
		System.out.println("누계 : " + totalsum);

	}

}
