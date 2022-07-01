package ch04;

public class Ex01 {

	public static void main(String[] args) {
		int[] score = {76,45,34,89,100,50,90,92};
		
//		내가 푼 방법
//		총점, 평균, 최고, 최저
		int sum = 0, max = score[0], min = score[0];
		for (int i = 0; i < score.length; i++) {
			sum +=score[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/score.length);
		System.out.printf("평균(소수점포함) : %.2f\n", (double)sum/score.length);

		for (int i = 0; i < score.length; i++) {
			if (score[i]>max) {
				max = score[i];
			}
		}
		System.out.println("최고 : " + max);
		
		for (int i = 0; i < score.length; i++) {
			if (score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("저 : " + min);
		System.out.println("======================");
		
		
//		풀이 예시
		int[] score1 = {76, 45, 34, 89, 100, 50, 90, 92};
		// 총점, 평균, 최고점, 최저점
		int sum1 = 0, max1 = score1[0], min1 = score1[0];
		for(int i1 = 0; i1 < score.length; i1++) {
			sum1 += score1[i1];
			if (score[i1] > max1) max1 = score[i1];
			if (score[i1] < min1) min1 = score[i1];
		}
		System.out.println("총점 : " + sum1);
		System.out.println("평균 : " + sum1/score1.length);
		System.out.printf("평균 : %.2f\n",(double)sum1/score1.length);
		System.out.println("최대값 : " + max1);
		System.out.println("최소값 : " + min1);

	}

}
