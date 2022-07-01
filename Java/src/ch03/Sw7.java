package ch03;

public class Sw7 {

	public static void main(String[] args) {
		
//		100만 이상 A, 70만 이상 100만 미만 B, 50만 이상 70만 미만 C
//		30만 이상 50만 미만 D, 30만 미만 F
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		if (salary > 1000000) grade = "A";
		else
			switch (salary/100000) {
			case 10 : grade = "A"; break;
			case 7 : case 8 : case 9 : grade = "B"; break;
			case 5 : case 6 : grade = "C"; break;
			case 3 : case 4 : grade = "D"; break;
			default : grade = "F";
			}
		
		System.out.printf("급여는 %d원이고 등급은 %s입니다", salary, grade);

	}

}
