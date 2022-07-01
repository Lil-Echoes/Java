package ch04;

public class Arr3 {

	public static void main(String[] args) {
		int[] s1 = {10, 20, 30, 40, 50};			// 배열 선언, 생성 및 대입이 동시에 실시
		for (int i = 0; i < s1.length; i++) {
			System.out.printf("s1[%d] = %d\n", i, s1[i]);
		}
		System.out.println("=============");
		
//		일반 for문 출력
		int[] s2 = new int[] {11,21,31,41,51};
		for (int i = 0; i < s2.length; i++) {
			System.out.printf("s2[%d] = %d\n", i, s2[i]);
		}
		System.out.println("=============");
		
//		확장 for문 출력
		int[] s3;
		s3 = new int[] {12, 22, 32, 42, 52};
		for (int i : s3) {
			System.out.println(i);
		}
		
//		int[] s4;
//		s4 = {12,22,32,45,66}; 이것은 에러

	}

}
