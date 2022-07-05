package ch05;

class Score1 {
	
//	클래스 밑에 선언한 변수는 여러 메소드에서 같이 사용 가능 -> 전역 변수
	String name;
	int kor, eng, math;
	
	void print() {									// 지역변수 : 해당하는 메소드에서만 사용 가능하고 다른 메소드에서 사용 못함
		
		int sum =kor + eng + math;					// 메소드 안에서 정의된 변수
		
		System.out.println(name + "의 성적");
		System.out.printf("국어\t영어\t수학\n");
		System.out.printf("%d\t%d\t%d\n", kor, eng, math);
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, (double)sum/3);
		System.out.println("=========================");
	}
	
//	void cal() {
//		System.out.println("국어 : " + kor);
//		System.out.println("총점 : " + sum);
//
//	}
	
}

public class Score1Ex {

	public static void main(String[] args) {
		
//		Score st1, st2, st3
//		st1 제니, 88, 77, 99
//		st2 보검, 77, 66, 90
//		st3 로제, 92, 88, 93
//		성적과 총점 평균 실행
		
		Score1 st1 = new Score1();
		st1.name = "제니";
		st1.kor = 88;
		st1.eng = 77;
		st1.math = 99;
		
		Score1 st2 = new Score1();
		st2.name = "보검";
		st2.kor = 77;
		st2.eng = 66;
		st2.math = 90;
		
		Score1 st3 = new Score1();
		st3.name = "로제";
		st3.kor = 92;
		st3.eng = 88;
		st3.math = 93;
		
		st1.print();
		st2.print();
		st3.print();
	}

}
