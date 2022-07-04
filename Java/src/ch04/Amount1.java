package ch04;

public class Amount1 {

	public static void main(String[] args) {
		
		String subject = "매출현황";
		String[] title = {"제품명", "1월", "2월", "3월", "4월", "합계", "평균"};
		String[] name = {"냉장고", "테레비", "청소기"};
		int[][] amt = {{250, 170, 300, 780}, {170, 120, 150, 220}, {450, 230, 400, 250}};
		int len = 56, sum = 0;
		int tot[] = new int[amt[0].length];
		
		System.out.printf("%s\n\n", subject);
		
		
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (int i = 0; i < amt.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < amt[i].length; j++) {
				System.out.print(amt[i][j] + "\t");
				sum += amt[i][j];
				tot[j] += amt[i][j];
			}
			System.out.printf("%d\t%.1f\n", sum, (double)sum/amt[i].length);
			sum=0;
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.print("총계\t");
		for (int i = 0; i < tot.length; i ++) {
			System.out.print(tot[i] + "\t");
			sum += tot[i];
		}
		System.out.printf("%d\t%.1f\n", sum, (double)sum/tot.length);
		
	}

}
