package ch07;

class G1 {
	
	String msg = "대박";
	
	G1 () {
		System.out.println("매개변수가 없는 부모 생성자");
	}
	G1 (String str) {
		this();
		System.out.println("매개변수가 하나 " + str);
	}
	
	void g1() {
		System.out.println("부모 메소드");
	}
}

class G2 extends G1	{
	
	String msg = "쪽박";
	
	G2 (String str) {
		
		super(str);
		System.out.println("매개변수 한개인 자식 생성자 " + str);
		
	}
		
	void g1() {
		System.out.println("자식 메소드");
	}
	
	void print() {
		System.out.println("msg : " + super.msg);
		super.g1();
		System.out.println("msg : " + msg);
		g1();
		
	}
}


public class Super3 {
	public static void main(String[] args) {
		
		G2 g2 = new G2 ("헬 ~");
		g2.print();
	}

}
