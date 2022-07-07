package ch07;

public class C3 extends C2 {		// C2가 먼저 생성되어야 C3를 생성 가능
	String c3 = "덥니";
	C3() {
		System.out.println("난 자식 생성자");
	}
	
	void c31() {
		System.out.println("난 자식 메소드");
	}
	
}
