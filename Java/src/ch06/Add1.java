package ch06;

class A1 {
	void add(int x, int y) {								// x, y 매개변수(parameter) -> 이 메소드를 사용하려면 정수 두개를 넣어줘
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
	
//	void 반환할 것이 없다
	void prn(String name) {
		System.out.println(name + "님! 안녕하세요");
	}
	
//	반환형 (실행한 결과를 정수로 만들어서 이 메소드를 호출한 곳으로 전달)
	int multiply(int x, int y) {
		return x * y;
	}
}

public class Add1 {
	
	static void minus(int x, int y) {
		System.out.println(x + " - " + y + " - " +(x-y));
	}
	
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add(7, 8);
		a1.add(21, 77);
//		a1.add(12.4, 4.6);						// int인 매개변수에는 int만 입력해야 한다
		a1.prn("철수");
		a1.prn("차은우");
		System.out.println(a1.multiply(7, 8));
		minus(12,7);							// Add1.가 생략 (같은 class 안에 있어서) 
	}

}
