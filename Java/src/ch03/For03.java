package ch03;

public class For03 {

	public static void main(String[] args) {
		
//		evenSum, oddSum, sum - 짝수합, 홀수합, 전체 합 1 ~ 100
		
//		내가 푼 방법
		int evenSum = 0, oddSum = 0, sum = 0;
		
		for(int i=2; i <= 100; i+=2) {
			evenSum+=i;
		}
		System.out.println("짝수 합계 : " + evenSum);
		
		for(int i=1; i <= 100; i+=2) {
			oddSum+=i;
		}
		System.out.println("홀수 합계 : " + oddSum);
		
		for(int i=1; i <= 100; i+=1) {
			sum+=i;
		}
		System.out.println("전체 합계 : " + sum);

		
		evenSum = 0; oddSum = 0; sum = 0;			// 초기화
		
		
//		풀이 예시
		for (int i = 1; i <=100; i++) {
			if (i % 2 == 0) evenSum += i;
			else oddSum +=i;
		}
		System.out.println("짝수 합계 : " + evenSum);
		System.out.println("홀수 합계 : " + oddSum);
		System.out.println("홀수 합계 : " + (evenSum + oddSum));
		
		
		
	}

}
