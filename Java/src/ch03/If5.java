package ch03;

public class If5 {

	public static void main(String[] args) {
		
//		내가 푼 방법
		int money = Integer.parseInt(args[0]);
		if (money >= 1000000)
			System.out.println("비행기 타세요");
		else if (money >=100000)
			System.out.println("KTX 타세요");
		else if (money >=10000)
			System.out.println("택시 타세요");
		else if (money >=5000)
			System.out.println("버스 타세요");
		else
			System.out.println("걸어가세요");
		
//		풀이 예시
		String msg = "";
		if (money >= 1000000)
			msg = "비행기 타세요";
		else if (money >=100000)
			msg = "KTX 타세요";
		else if (money >=10000)
			msg = "택시 타세요";
		else if (money >=5000)
			msg = "버스 타세요";
		else
			msg = "걸어가세요";
		System.out.println(msg);

	}

}
