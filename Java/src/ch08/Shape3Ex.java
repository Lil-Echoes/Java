package ch08;

public class Shape3Ex {
	public static void main(String[] args) {
		Shape3[] shape = new Shape3[3];
		shape[0] = new Circle3();
		shape[1] = new Rectangle3();
		shape[2] = new Triangle3();
		
		for(int i = 0; i < shape.length; i++) {
			shape[i].print();
			shape[i].computeArea();
		}
	}

}
