package ch02;

public class Substitute3 {

	public static void main(String[] args) {
		
		int i1 = 10, i2 = 5;
		
		System.out.println("i1 = " + (i1 += i2) + ", i2 = " + i2);
		System.out.println("i1 = " + (i1 -= i2) + ", i2 = " + i2);
		System.out.println("i1 = " + (i1 *= i2) + ", i2 = " + i2);
		System.out.println("i1 = " + (i1 /= i2) + ", i2 = " + i2);
		System.out.println("i1 = " + (i1 %= i2) + ", i2 = " + i2);
		
	}

}
