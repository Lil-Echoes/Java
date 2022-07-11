package ch08;

class Person {
	int leg = 2;
	void move() {
		System.out.println("두 다리로 걷는다");
	}
}

interface Fish {
	void swim();
}

interface Bird {
	void eat();
}

class Mermaid extends Person implements Fish, Bird {
	public void swim() {
		System.out.println("지느러미로 수영한다");
	}

	@Override
	public void eat() {
		System.out.println("부리로 쪼아 먹는다");
	}
}

public class MermaidEx {
	public static void main(String[] args) {
		Mermaid mm = new Mermaid();
		mm.move();
		mm.swim();
		mm.eat();
		System.out.println("다리 갯수 : " + mm.leg);
	}

}
