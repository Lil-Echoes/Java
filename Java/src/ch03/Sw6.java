package ch03;

public class Sw6 {

	public static void main(String[] args) {
		
		int score = Integer.parseInt(args[0]);
		String grade = "";
		int etc =score/10;
		
		switch (etc) {
		case 9 : case 10 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.printf("입력한 점수는 %d이고 학점은 %s입니다", score, grade);

	}

}
