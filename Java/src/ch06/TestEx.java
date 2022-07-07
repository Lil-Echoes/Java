package ch06;

//	이 클래스는 어떠한 형태로 객체가 생성되어도 결국 마지막 생성자가 호출된다
//	여기서 사용된 this 는 같은 클래스 내의 다른 생성자를 호출하는 역할을 한다

class Test {
	
	int kor;
	int eng;
	int math;
	
	public Test () {
		this(1,1,1);
	}
	
	public Test (int k) {
		this(k,1,1);
	}
	
	public Test (int k, int e) {
		this(k,e,1);
	}
	public Test (int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	
	void print() {
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", kor, eng, math);
	}
}

public class TestEx {
	public static void main(String[] args) {
		
		Test t1 = new Test(100);
		t1.print();
		
		Test t2 = new Test(100, 88);
		t2.print();
		
		Test t3 = new Test(100, 88, 67);
		t3.print();
	}
	
}
