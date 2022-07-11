package ch08;


interface G {
	void b1();
}

class G1 {
	
//	각각의 메소드는 클래스와 아까보다 결합도 느슨해(loosely) 졌다
	void m1(G f) {		// 클래스명을 직접 사용하는 것이 아니라 인터페이스 거쳐서 사용
		f.b1();
	}
	
}

class G2 implements G{
	public void b1() {
		System.out.println("대박");
	}
}

class G3 implements G {
	public void b1() {
		System.out.println("쪽박");
	}
}

public class InterTest2 {
	public static void main(String[] args) {
//		G2 f2 = new G2();
		G3 f2 = new G3();
		G1 f1 = new G1();
		f1.m1(f2);
	}

}
