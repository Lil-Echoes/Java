package ch08;

//	인터페이스 클래스 대신에 interface로 서술
//	모든 변수는 public final이 생략된 것으로 간주; 변수 값을 변경할 수 없다
//	모든 메소드는 public abstract가 생략된 것으로 간주; 선언부만 있고 구현부가 없다
//	인터페이스는 객체를 생성할 수 없어서 구현한 클래스를 이용하여 객체를 생성
interface B1 {
	int K = 7;
	void m1();
	void m2();
}

//	인터페이스는 extends가 아니라 implement(구현하다)를 사용
class B2 implements B1 {
	
	@Override
	public void m1() {
		System.out.println("K = " + K);
		System.out.println("재택 할만 하네");
		
	}
	
	@Override
	public void m2() {
		System.out.println("대박 사건");

	}
	
}

class B3 implements B1 {
	
	@Override
	public void m1() {
		System.out.println("허걱");
	}
	
	@Override
	public void m2() {
		System.out.println("허걱");

	}
	
}



public class Inter1Ex {
	public static void main(String[] args) {
//		B1 b1 = new B1();		// 인터페이스는 생성할 수 없음
		B1 b1 = new B2();		// 생성은 안되지만 선언은 가능
		b1.m1();
		b1.m2();
		
		B1[] b = {b1, new B3()};
		b[0].m1();
		b[0].m2();
		b[1].m1();
		b[1].m2();
		
	}

}
