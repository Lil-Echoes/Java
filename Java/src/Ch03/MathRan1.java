package Ch03;

public class MathRan1 {

	public static void main(String[] args) {
		
//		Math.random() -> 0이상 1미만의 실수를 임의로 생성
		System.out.println(Math.random());
//		Math.random() * 100 -> 0이상 100미만의 실수
		System.out.println(Math.random() * 100);
//		(int)(Math.random() * 100) + 1 -> 1 ~100 사이의 정수
		System.out.println((int)(Math.random() * 100) + 1);

	}

}
