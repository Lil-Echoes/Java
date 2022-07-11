package ch08;

//	final class Parent {		// class명에 final 상속 금지
class Parent {
	
	int a = 7;
	final int B = 8;			// final이 붙으면 변수명을 대문자로 표시 권장
	
	void m1() {
		a = 10;
//		B = 20;					// final이 있으면 상수(변경 불가)
		System.out.println("대박");
	}
		
	final void m2() {			// 메소드에서 final overriding 금지
		System.out.println("사건");
	}
	
}


class Child extends Parent {
	void m1() {
		System.out.println("재정의 되네");
	}
	
//	void m2() {								// final이 붙어있는 메소드는 재정의 할 수 없다
//		System.out.println("재정의 안됨");
//	}
}

public class Final {
	
}