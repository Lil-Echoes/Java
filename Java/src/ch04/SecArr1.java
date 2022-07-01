package ch04;

public class SecArr1 {

	public static void main(String[] args) {
		int[][] test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
//		0행 끝
		test[1][0] = 101;
		test[1][1] = 201;
		test[1][2] = 301;
//		1행 끝
		int sum=0;
		
		for(int i = 0; i < test.length; i++) {			// test.length -> 행의 갯수
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]+"\t");
				sum += test[i][j];
			}
			System.out.println(sum);
			sum = 0;
			
		}
		System.out.println("=============================");
														//          행    2중배열
		for(int[] t11 : test) {							// for(int[] a : array) -> int[] 2중 배열에서 a로 행별로 나누어 가져온다
			for(int t : t11 ) {							// 							{100, 200, 300} {101, 201, 301}
				System.out.print(t + "\t");				// for(int b : a) -> 행별로 가져온 a에서 b로 열별로 값을 가져온다
				sum += t;
			}
			System.out.println(sum);
			sum=0;
		}

	}

}
