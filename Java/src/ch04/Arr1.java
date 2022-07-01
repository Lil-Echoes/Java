package ch04;

public class Arr1 {
	public static void main(String[] args) {
		int[] i1 = new int[5];
		i1[0] = 45;
		i1[1] = 56;
		i1[2] = 12;
		i1[3] = 88;
		i1[4] = 77;
//		i1[5] = 54;		// 범위를 넘어서 에러
//		배열명.length : 배열의 갯수
		for (int i=0; i<i1.length; i++) {
			System.out.printf("i1[%d] = %d\n", i, i1[i]);
		}
//		확장 for, 신 for
		for(int i : i1) {
			System.out.println(i);
		}
	}
}
