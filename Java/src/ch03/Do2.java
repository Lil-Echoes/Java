package ch03;

public class Do2 {

	public static void main(String[] args) {
		
//		1 ~ 10 까지 합계 do ~ while 사용
		int i = 1, sum = 0;
		
		do {
			sum +=i;
			i++;
		} while(i<=10);
		System.out.println(sum);

	}

}
