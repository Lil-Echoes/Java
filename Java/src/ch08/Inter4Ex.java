package ch08;

interface E1 {
	void e1() ;
}

interface E2 extends E1 {
	void e2();
}

interface E3 extends E2 {
	void e3();
}

class E4 implements E3 {
	
	@Override
	public void e1() {
		System.out.println("산딸기");
	}
	
	@Override
	public void e2() {
		System.out.println("판딸기");
	}
	
	@Override
	public void e3() {
		System.out.println("죽은딸기");
	}
}

public class Inter4Ex {
	public static void main(String[] args) {
		E4 e = new E4();
		e.e1();
		e.e2();
		e.e3();
	}

}
