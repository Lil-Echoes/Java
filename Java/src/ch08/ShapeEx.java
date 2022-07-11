package ch08;

public class ShapeEx {
	public static void main(String[] args) {
		
		Shape[] sh = new Shape[3];
		sh[0] = new Circle();					// 부모를 선언하고 자식을 생성
		sh[1] = new Triangle();					// up casting 묵시적
		sh[2] = new Rectangle();
		
//		draw() 메소드를 원 그릴 때, 삼각형 그릴 때, 사각형 그릴 때 다양하게 사용된다 -> 다형성
		for(int i = 0; i < sh.length; i++) {
			sh[i].draw();
		}

		
	}

}
