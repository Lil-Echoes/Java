package ch06;

public class Meth1 {
	static void hello(String name, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name + "님 안녕");
		}
		return;										//여기가 이 메소드 끝, 생략 가능
	}
	
	static int add(int x, int y) {
		return x + y;								// 결과는 반드시 반환형과 같은 데이터 형식이어야 한다. 반환형보다 범위가 작으면 괜찮음(묵시적 형변환)
	}
	
	public static void main(String[] args) {
		hello("제니", 7);
		System.out.println(add(5,7));
	}

}
