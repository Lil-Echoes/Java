package ch07;

public class FruitBuyer3 {
	
	String name;
	int numOfApple;
	int money;
	public FruitBuyer3 (String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	
	void buyApple(FruitSeller3 fs, int amt) {
		if (money < amt) {
			System.out.println("돈이 부족해서 못 사겠네 ㅠㅠ");
		} else {
			int num = fs.saleApple(amt);
			if (num != 0) {
				numOfApple += num;
				money -= amt;
				System.out.printf("%s 사과 득템 %d개, 지출 %d원\n", name, num, amt);
			} else System.out.println("사과를 못 샀습니다");
		} 
			
	}
	
	void print() {
		System.out.println(name + "의 사과 갯수 : " + numOfApple);
		System.out.println(name + "의 현금잔액 : " + money);
		System.out.println("===========================");
	}
}
