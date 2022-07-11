package ch07;

public class Score1Ex {
	public static void main(String[] args) {
		
		String subject = "성적표";
		String[] name = {"BTS", "아이유", "유재석", "블랙"};
		String[] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
		int len = 47;
		
		Score1 sc = new Score1(subject, name, title, score, len);
		sc.print();
		
	}

}
