package ch04;

public class Ex03 {

	public static void main(String[] args) {
		
		int[][] arr = { { 5, 5, 5, 5, 5}, {10, 10, 10, 10, 10}, {20, 20, 20, 20, 20}, {30, 30, 30, 30, 30}};
		int sum = 0, tot = 0;
		
//		행병 합계(sum), 전체 합계(tot)
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
				tot += arr[i][j];
			}
			System.out.printf("합계 : %d", sum);
			System.out.println();
			sum=0;
			
		}
		System.out.printf("총 합계 : %d", tot);

	}

}
