package Ch03;

public class If8 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month >= 1 && month <= 2) season = "겨울입니다";
		else if (month >= 3 && month <= 5) season = "봄입니다";
		else if (month >= 6 && month <= 8) season = "여름입니다";
		else if (month >= 9 && month <= 11) season = "가을입니다";
		else season = "위 숫자가 아니면 바보아냐";
		
		System.out.println(season);

	}

}
