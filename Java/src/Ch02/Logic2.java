package Ch02;

public class Logic2 {

	public static void main(String[] args) {
		
//		논리 연산자가 끝난 후에 대입연산자(=) 실핼
		boolean b1 = 5 > 3, b2 = 5 < 3;		// b1 = true, b2 = false
		boolean b3 = 5 == 3, b4 = 5 != 3;	// b3 = false, b4 = true
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
		System.out.println("t && t = " + (b1 && b4));
		System.out.println("t && f = " + (b1 && b2));
		System.out.println("f && t = " + (b3 && b4));
		System.out.println("f && f = " + (b2 && b3));
		
		System.out.println("t || t = " + (b1 || b4));
		System.out.println("t || f = " + (b1 || b2));
		System.out.println("f || t = " + (b3 || b4));
		System.out.println("f || f = " + (b2 || b3));
	}

}
