package ch02;

public class Oper3 {

	public static void main(String[] args) {
		
		int i1 = 1000000;
		int i2 = 2000000;
		
//		int * int 결과는 int : int를 담을 범위를 넘었다
//		long * int -> long * long -> 결과도 long
		
		long l1 = (long)i1 * i2;
		System.out.println("l1 = " + l1);

	}

}
