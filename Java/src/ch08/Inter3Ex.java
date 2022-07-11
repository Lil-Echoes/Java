package ch08;

interface D1 {
	void m1();
}

interface D2 extends D1 {			// 인터페이스끼리는 implements가 아니라 extends를 사용
	void m2();
}

interface D3 {
	void m3();
}

interface D4 extends D2, D3 {		// 인터페이스끼리는 다중 상속이 가능
	void m4();
}

class D5 implements D4 {
	@Override
	public void m1() {
		System.out.println("막걸리가 땡기는 날씨야");
	}
	
	@Override
	public void m2() {
		System.out.println("비가 가리비로 바뀌었네");
	}
	
	@Override
	public void m3() {
		System.out.println("파전은 어때");
	}
	
	@Override
	public void m4() {
		System.out.println("요즘은 파전이 아니라 핏자지");
	}
	
}

public class Inter3Ex {
	public static void main(String[] args) {
		D5 d5 = new D5();
		d5.m1();
		d5.m2();
		d5.m3();
		d5.m4();
	}

}
