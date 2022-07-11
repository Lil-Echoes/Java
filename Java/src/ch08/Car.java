package ch08;

public abstract class Car {
	
	int x = 10;
	
	abstract void move();

}

class Ambulance extends Car {
	
	void move() {
		System.out.println("환자를 싣고 이동한다");
	}
	
}

class FireEngine extends Car {
	
	void move() {
		System.out.println("싸이렌을 울리면서 이동한다");
	}
	
}

class Bus extends Car {
	
	void move() {
		System.out.println("승객을 태우고 이동한다");
	}
	
	void inwon() {
		System.out.println("정원은 40명이다");
	}
	
}
