package ch04;

public class SecArr3 {

	public static void main(String[] args) {
		
//		수지 {99, 66, 88} 평균{소숫점 2자리} 일반 for 사용
		int[][] score = {{90, 88, 78}, {77, 88, 99}, {55, 99, 95}, {78, 90, 67}, {99, 66, 88}};
		String[] name = {"제니", "보검", "로제", "은우", "수지"};
		
		int sum = 0;
		
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("==============================================");
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
			}
			System.out.print(sum + "\t");
			System.out.printf("%.2f\n",(double)sum/score.length);
			sum = 0;
			
		}

	}

}
