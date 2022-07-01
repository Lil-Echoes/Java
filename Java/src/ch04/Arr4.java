package ch04;

public class Arr4 {

	public static void main(String[] args) {
		int[] kor = {76, 88, 99, 100, 67, 78};
		
//		총점과 평균을 구하라
		int sum = 0;
		for (int i = 0; i < kor.length; i++) {
			sum += kor[i];
		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f", (float)sum/kor.length);
		
		System.out.println();
		System.out.println("============");
		
//		확장 for문으로 총점을 계산하고 평균은 소숫점 2자리
		int sum2 = 0;
		for (int j : kor) {
			sum2 += j;
		}
		System.out.println("총점 : " + sum2);
		System.out.printf("평균 : %.2f", (float)sum2/kor.length);

	}

}
