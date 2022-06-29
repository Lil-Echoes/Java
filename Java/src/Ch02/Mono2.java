package Ch02;

public class Mono2 {

	public static void main(String[] args) {
		
		int i1 = 5, i2 = 7;
		
//		5 * (5+1) + (2 + 7) * 3 -> 30 + 27 = 57
//		계산할 때는 i1을 1증가, 계산 후에 i2를 1감소
		int k1 = 5 * ++i1 + (2 + i2--) * 3;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("k1 = " + k1);
		
	}

}
