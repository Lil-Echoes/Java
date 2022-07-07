package ch06;

class B2 {
	void swap(int x, int y) {
		int imsi = x;
		x = y;
		y = imsi;
		System.out.println("m1 x = " + x);
		System.out.println("m1 x = " + y);
	}
}


public class CallByValue2 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		B2 b2 = new B2();
		
		b2.swap(x, y);
		
		System.out.println("main x = " + x);
		System.out.println("main x = " + y);
	}

}
