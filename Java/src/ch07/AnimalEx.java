package ch07;

public class AnimalEx {
	public static void main(String[] args) {
		
		Animal a1 = new Bird();
		Animal a2 = new Pig();
		Animal a3 = new Fish();
		
//		a1.move();
//		a2.move();
//		a3.move();
		
//		System.out.println("a1.x = " + a1.x);
//		System.out.println("a2.x = " + a2.x);
//		System.out.println("a3.x = " + a3.x);
		
		Animal[] animal = {a1, a2, a3};
		
//		for문 확장형
		for(Animal a : animal) {
			a.move();									//자식 메소그
			System.out.println("x = " + a.x);			// 부모 변수
			if (a instanceof Bird) {
				((Bird)a).eat();
			}
			System.out.println("===================");
		}
		
//		for문 일반형
		for(int i = 0; i < animal.length; i++) {
			animal[i].move();							// 자식 메소드
			System.out.println("x = " + animal[i].x);	// 부모 변수
			if (animal[i] instanceof Bird) {
				((Bird)animal[i]).eat();
			}
			System.out.println("===================");
		}
		
	}

}
