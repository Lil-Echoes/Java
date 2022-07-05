package ch05;

class Box2 {
	
	int width, height, depth;
	int a, b, c;
	
	Box2(int w) {
		width = w;
	}
	Box2(int w, int h) {
		width = w; height = h;
	}
	Box2(int w, int h, int d) {
		width = w; height = h; depth = d;
	}
	
	void square() {
//		a = width * width;
		System.out.println("정사각형의 넓이 : " + width * width);
	}
	void rectangle() {
//		b = width * height;
		System.out.println("직사각형의 넓이 : " + width * height);
	}
	void volume() {
//		c = width * height * depth;
		System.out.println("직육면체의 부피 : " + width * height * depth);
	}
}

public class Box2Ex {

	public static void main(String[] args) {
		Box2 b1 = new Box2 (10);
		Box2 b2 = new Box2 (10, 15);
		Box2 b3 = new Box2 (10, 15, 20);
		
		b1.square();
		b2.rectangle();
		b3.volume();
		
//		System.out.println("정사각형의 넓이 : " + b1.a);
//		System.out.println("직사각형의 넓이 : " + b2.b);
//		System.out.println("직육면체의 부피 : " + b3.c);
		
	}
		

}

