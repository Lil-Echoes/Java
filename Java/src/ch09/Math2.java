package ch09;

public class Math2 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
//		1~100 사이 정수
		int num = (int)(Math.random()*100) + 1;
		
		System.out.println(Math.sqrt(num));			// 루트 num
		
		System.out.println(Math.pow(2, 3));			// 2 ^ 3 = 8
		
	}

}
