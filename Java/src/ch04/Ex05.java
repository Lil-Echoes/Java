package ch04;

public class Ex05 {

	public static void main(String[] args) {
		
		int[][] score = {{67, 78, 98}, {78, 98, 65}, {78, 56, 90}};
		
//		행별로 출력하고 합계 최고점 최저점
//		총합계, 전체에서 최고점, 전체에서 최저점
		
		int sum = 0, max = 0, min = 100, tot = 0, tmax = 0, tmin = 100;
		System.out.println("국어\t영어\t수학\t합계\t최대\t최소");
		System.out.println("==================================================");
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot += score[i][j];
				if (max < score[i][j]) {
					max = score[i][j];
				}
				if (tmax < score[i][j]) {
					tmax = score[i][j];
				}
				if (min > score[i][j]) {
					min = score[i][j];
				}
				if (tmin > score[i][j]) {
					tmin = score[i][j];
				}
			}
			System.out.printf("%d\t%d\t%d", sum, max, min);
			sum=0;
			max=0;
			min=100;
			System.out.println();
			
		}
		System.out.println("==================================================");
		System.out.printf("총합계 : %d, 최대값 : %d, 최소값 : %d", tot, tmax, tmin);
		
	}

}
