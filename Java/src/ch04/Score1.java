package ch04;

public class Score1 {

	public static void main(String[] args) {
		
		String subject = "성적표";
		String[] name = {"BTS", "아이유", "유재석", "블랙핑크"};
		String[] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
		int len = 47, sum = 0;
		int[] tot = new int[score[0].length];
		System.out.println(subject);
		
		for (int i = 0; i < len; i++) {
			System.out.print("=");
			}
		System.out.println();
		
		
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
			}
		System.out.println();
		
		for (int i = 0; i < len; i++) {
			System.out.print("=");
			}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.print(sum + "\t");
			System.out.printf("%.1f\n", (double)sum/score[i].length);
			sum=0;
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print("=");
			}
		System.out.println();
		System.out.print("합계\t");
		for (int i = 0; i < tot.length; i++) {
			System.out.print(tot[i] + "\t");
			sum += tot[i];
		}
		System.out.println(sum);
	}

}
