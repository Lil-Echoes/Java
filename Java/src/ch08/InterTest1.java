package ch08;

class F1 {
	
//	각각의 메소드는 클래스와 단단히 결합
	void m1(G2 f) {								// 포함일 때 	f2
		f.b1();
	}
	
	void m2(G3 f) {								// 포함일 때 	f3
		f.b1();
	}

}

class F2 {
	void b1() {
		System.out.println("대박");
	}
}

class F3 {
	void b1() {
		System.out.println("쪽박");
	}
}

public class InterTest1 {
	public static void main(String[] args) {
//		F2 f2 = new F2();
		G3 f3 = new G3();
		F1 f1 = new F1();
//		f1.m1(f1);
		f1.m2(f3);
	}

}
