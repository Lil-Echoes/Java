package Ch03;

public class Sw8 {

	public static void main(String[] args) {
		
//		100만 초과 A, 70만 초과 100만 이하 B, 50만 초과 70만 이하 C
//		30만 초과 50만 이하 D, 30만 이하 F
		int salary = Integer.parseInt(args[0]);
		String grade = "";
		if (salary > 1000000) grade = "A";
		else
			switch ((salary-1)/100000) {
			case 7 : case 8 : case 9 : grade = "B"; break;
			case 5 : case 6 : grade = "C"; break;
			case 3 : case 4 : grade = "D"; break;
			default : grade = "F";
			}
		
		System.out.printf("급여는 %d원이고 등급은 %s입니다", salary, grade);

	}

}