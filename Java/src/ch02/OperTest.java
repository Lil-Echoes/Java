package ch02;

public class OperTest {

	public static void main(String[] args) {
		System.out.println("증감연산자");
		int a=2;
		int b=a;
		a++;
		System.out.println("a = " + a);
		b = a++;		// a-- -> 증감연산자 -> 변수 뒤에 위치 (postfix)
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int c = ++a;	// 변수 앞에 위치 (prefix)
		System.out.println("a = " + a);
		System.out.println("c = " + c);

	}

}
