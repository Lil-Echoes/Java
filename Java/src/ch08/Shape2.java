package ch08;

public class Shape2 {
	void print() {
	}
}

//	각각을 print() 재정의하여 

class Circle2 extends Shape2 {
	void print() {
		System.out.println("원을 출력한다");
	}

}

class Triangle2 extends Shape2 {
	void print() {
		System.out.println("삼각형을 출력한다");
	}

}

class Rectangle2 extends Shape2 {
	void print() {
		System.out.println("사각형을 출력한다");
	}

}