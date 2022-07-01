package ch02;

public class Oper1 {

	public static void main(String[] args) {
		
		int i1 = 7, i2 = 5;
		
		System.out.println("i1 + i2 = " + (i1 + i2));
		System.out.println("i1 % i2 = " + (i1 % i2));
		System.out.println("i1 > i2 => " + (i1 > i2));
		System.out.println("i1 == i2 => " + (i1 == i2));
		System.out.println("i1 != i2 => " + (i1 != i2));
		System.out.println("i1 == i2 && i1 != i2 => " + (i1 == i2 && i1 != i2));
		System.out.println("i1 == i2 || i1 != i2 => " + (i1 == i2 || i1 != i2));
		
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		int k1 = i1++ * 3 + --i2;			// 7 * 3 + 4 = 25
		System.out.println("k1 = i1++ * 3 + --i2");
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", k1 = " + k1);
		
	}

}
