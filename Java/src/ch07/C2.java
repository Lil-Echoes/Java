package ch07;

public class C2 extends C1 {		// C1이 먼저 생성되어야 C2를 생성 가능
	int c2 = 100;
	C2() {
		System.out.println("난 아버지 생성자");
	}
	
	void c21() {
		System.out.println("난 아버지 메소드");
	}

}