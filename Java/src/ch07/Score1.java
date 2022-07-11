package ch07;

public class Score1 {
	String subject;
	String[] name;
	String[] title;
	int[][] score;
	int len, sum=0;
	int[] tot;
	
	public Score1(String subject, String[] name, String[] title, int[][] score, int len) {
		this.subject = subject; this.name = name; this.title = title; this.score = score; this.len = len; tot = new int[score[0].length];
	}

	public void print() {
				
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
