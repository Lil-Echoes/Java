package ch05;

public class Static3Ex {

	static int i1 = 5;
	int i2;			
	// 전역 변수, instance변수(멤버변수)
	void add() {
		System.out.printf("%d + %d = %d\n", i1, i2, i1 + i2);
	}
		
	public static void main(String[] args) {
			
//	클래스명과 main() 메소드를 가진 클래스와 같을 때는 클래스명을 생략할 수 있다
		System.out.println("i1 = " + Static3Ex.i1);
		System.out.println("i1 = " + i1);
		
		Static3Ex s1 = new Static3Ex();
		System.out.println("i1 = " + s1.i1);
		
		int i2 = 12;											// 지역 변수
		System.out.println("i2 = " + i2);
			
		s1.add();

			
	}

}
