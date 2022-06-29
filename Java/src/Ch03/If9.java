package Ch03;

public class If9 {

	public static void main(String[] args) {
		
//		내가 푼 방법
		int num = Integer.parseInt(args[0]);
		String msg = "";
		if (num < 10) msg = "10미만의 값입니다";
		else if (num >=10 && num < 100) msg = "10이상 100미만의 값입니다";
		else if (num >=100 && num < 1000) msg = "100이상 1000미만의 값입니다";
		else msg = "1000이상의 값입니다";
		
		System.out.println(msg);
		
//		풀이 예제
		if (num < 10) msg = "10미만";
		else if (num < 100) msg = "10이상 100미만";
		else if (num < 1000) msg = "100이상 1000미만";
		else msg = "1000이상";
		
		System.out.printf("입력한 값은 %d이고 결과는 %s입니다", num, msg);
		

	}

}
