package ch04;

import java.util.Arrays;

public class ArrCopy1 {

	public static void main(String[] args) {
		
		int[] arr1 = {12, 67, 88, 99};
		
//		주소 복사 -> 변수를 변수에 대입
		int[] arr2 = arr1;
		
//		값 복사
		int[] arr3 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
//		값 복사(더 쉬운 방법)
		int[] arr4 = new int[arr1.length];
//		System.arraycopy 값(원본, 원본의 복사 시작 위치, 대상, 대상의 복사 위치, 갯수)
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		arr1[1] = 100;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));


	}

}
