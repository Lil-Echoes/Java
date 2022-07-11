package ch08;

interface C {
	void b1();
}

class C1 implements C {
	@Override
	public void b1() {
		System.out.println("대박");
	}
}

class C2 implements C {
	@Override
	public void b1() {
		System.out.println("비오네");
	}
}


public class Inter2Ex {
	public static void main(String[] args) {
		C[] c = {new C1(), new C2()};
		c[0].b1();
		c[1].b1();
	}

}
