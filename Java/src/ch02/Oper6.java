package ch02;

public class Oper6 {

	public static void main(String[] args) {
		
		float pi = 3.141592f;
		
//		정수로 바뀌면 소숫점 이하 절사
//		(int)3141.592 / 1000f -> 3141 / 1000f -> 3141.0 / 1000.0 -> 3.141
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);
		
//		반올림 Math.round(3141.592) -> 3142
		shortPi = Math.round(pi * 1000) / 1000f;
		System.out.println(shortPi);
		
		

	}

}
