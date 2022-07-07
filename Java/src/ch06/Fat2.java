package ch06;

public class Fat2 {

	public static void main(String[] args) {
		
		int[] num = {3, 4, 5, 6};
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d! = ", num[i]);
			System.out.println(fat(num[i]));
			}
		
		System.out.println("==================================");
		
		for (int n : num) {
			System.out.print(n + "! = ");
			System.out.println(fat2(n));
		}
	}
	
	static int fat(int num) {
		int result =1;
		for(int i = num; i > 0; i--) {
			if (i==1) {
				System.out.printf("%d = ", i);
				result *= i;
			} else {
			System.out.printf("%d * ", i);
			result *= i;
			}
		}
		return result;
	}
	
	static int fat2(int num) {							// recursive(반복) 함수, 주의사항은 매개변수 값을 계속 변경해야 한다
		if (num==1) {
			System.out.printf("%d = ", num);
			return 1;
		}
		else {
			System.out.printf("%d * ", num);
			return num * fat2(--num);					// 3 * fat(2) -> 3 * 2 * fat(1) -> 3 * 2 * 1 -> 6
		}
	}
}
