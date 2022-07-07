package ch06;

class A3 {
	
//	void 반환할 것이 없음, 비어 있음
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
//		return;												// 이 메소드 종료, 생략 가능
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	void prn(int x) {
		for (int i = 0; i < x; i++) {
			if (i==3) return;								// 메소드의 끝
			System.out.println("대박");
		}
	}
}

public class Return1 {
	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.add(12,5);
		
		int k =a3.minus(12, 5);								// 데이터 형은 반환형과 일치해얗 한다
		System.out.println(k);
		
//		System.out.println(a3.add(17, 6));					// 출력할 것이 없어서, add()에서 반환한 것이 없음
		System.out.println(a3.minus(12, 5));
		
		a3.prn(10);
	}

}
