package ch03;

public class Continue2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" 안쪽 " + j);
				if(j > 3) continue;			// 아래 문장을 실행하지 않고 조건에 있는 증감으로 간다
				System.out.print(" 대박 " + j);
			}
			System.out.println("바깥 " + i);
		}

	}

}
