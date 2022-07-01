package ch02;

public class RelationalOPTest {

	public static void main(String[] args) {
		
		byte a = 20; double d = 3.14;
		boolean fag;
		
		fag = a > d;		// 비교 연산자 사용
		System.out.println("a가 d보다 큰가? " + fag);
		
		fag = a == 20.0f;	// 비교 연산자 사용
		System.out.println("a가 20.0f와 같은가? " + fag);
		
		int b = 10;
		fag = 10 != b;		// 비교 연산자 사용
		System.out.println("10이 10과 같지 않은가? " + fag);
		
		fag = 10 <= 20;		// 비교 연산자 사용
		System.out.println("10이 20보다 작거나 같은가? " + fag);
		System.out.println("10이 20보다 작은가? " + (10 < 20));
		System.out.println("10이 20보다 크거나 같은가? " + (10 >= 20));

	}

}
