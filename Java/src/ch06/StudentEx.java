package ch06;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="홍길동";
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;
		
		System.out.printf("이름 : %s\n", s1.name);
		System.out.printf("총점 : %d\n", s1.getTotal());
		System.out.printf("평균 : %f\n", s1.getAverage());
		
		s1.prn();
		
		Student s2 = new Student("로제", 90, 80, 88);
		s2.prn();
		
	}

}
