package ch08;

//	메소드 중에 하나라도 추상 메소드가 있으면 그 클래스는 추상 클래스여야 된다
//	부모클래스의 메소드 중에서 자식 클래스마다 다르게 실행해야 하는 메소드를 추상 메소드로 만든다
public abstract class Shape3 {
	
	void print() {
		System.out.println("자택에서 수업을 들으니 편하네");
	}
	
//	추상 메소드는 선언부는 있으나 구현부가 없는 메소드
	abstract void computeArea(); 

}

class Circle3 extends Shape3 {
	void computeArea() {
		System.out.println("원의 면적 : 3.14 * 반지름 * 반지름");
	}
}

//	추상 메소드는 자식 클래스에서 반드시 재정의(overriding)해야 한다
class Rectangle3 extends Shape3 {
	@Override
	void computeArea() {
		System.out.println("사각형의 면적 : 가로 * 세로");
	}
}

class Triangle3 extends Shape3 {
	@Override
	void computeArea() {
		System.out.println("사각형의 면적 : 가로 * 세로 / 2");
	}
}