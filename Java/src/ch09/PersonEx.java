package ch09;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person(1111, "로제", 25);
		Person p2 = new Person(1111, "보검", 27);
		Person p3 = new Person(2222, "로제", 45);
		
		if (p1==p2) System.out.println("p1과 p2는 같다");
		else System.out.println("p1과 p2는 다르다");
		
		if (p1==p3) System.out.println("p1과 p3는 같다");
		else System.out.println("p1과 p3는 다르다");
		
		System.out.println("====================================");
		
		if (p1.equals(p2)) System.out.println("p1과 p2는 같다");
		else System.out.println("p1과 p2는 다르다");
		
		if (p1.equals(p3)) System.out.println("p1과 p2는 같다");
		else System.out.println("p1과 p2는 다르다");
		
//		toString 재정의 안하면 패키지명.클래스명.크래스
//		p1.toString()이지만 toString()
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
	}

}
