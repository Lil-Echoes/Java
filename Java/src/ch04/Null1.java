package ch04;

public class Null1 {

	public static void main(String[] args) {
		int i1 = 0;								// 기본형은 초기화 해야 사용 가능
		System.out.println("i1 = " + i1);
		
		int[] k1 = new int[3];				// 참조형 초기값 -> 숫자는 0, boolean은 false, 문자는 null
		System.out.println("k1[0] = " + k1[0]);
		System.out.println("k1[0] = " + k1[1]);
		System.out.println("k1[0] = " + k1[2]);

		char[] k2 = new char[3];
		System.out.println("k2[0] = " + k2[0]);
	}

}
