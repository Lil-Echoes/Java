package ch08;

class A1 {
	void m1() {
		System.out.println("난 부모 메소드");
	}
}

class A2 extends A1 {
	void m1() {
		System.out.println("난 자식 메소드");
	}
}

class A3 extends A1 {
	void m1() {
		System.out.println("난 아들 친구 메소드");
	}
}


public class OverEx {
	public static void main(String[] args) {
		A1 a1 = new A2();						// 부모 선언 = 자식 생성
		a1.m1();								// 자식 것이 실행
		A1 a3 = new A3();						// 부모 선언 = 자식 생성
		a3.m1();								// 자식 것이 실행
	}

}
