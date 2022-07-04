package ch04;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			sum +=arr[i];
		}
		System.out.println("합계 : " + sum);
		sum=0;		// sum 초기화
		
		for(int i : arr) {
			System.out.print(i + "\t");;
			sum += i;
		}
		System.out.println("합계 : " + sum);

	}

}
