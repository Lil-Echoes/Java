package ch03;

public class If3 {

	public static void main(String[] args) {
		
//		점수가 60점 이상이면 합격, 60점 미만이면 불합격
		int score = Integer.parseInt(args[0]);
		if (score >= 60) {
			System.out.println(score + "점으로 합격입니다.");
		} else {
			System.out.println(score + "점으로 불합격입니다.");
		}

	}

}
