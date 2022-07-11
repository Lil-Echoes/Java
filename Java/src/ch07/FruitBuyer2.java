package ch07;

public class FruitBuyer2 {
	
	String name;
	int numOfApple;
	int money;
	public FruitBuyer2 (String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
	
	void buyApple(FruitSeller2 fs1, int amt) {
		int num = fs1.saleApple(amt);	
		numOfApple += num;
		money -= amt;
	}
	
	void print() {
		System.out.println(name + "의 사과 갯수 : " + numOfApple);
		System.out.println(name + "의 현금잔액 : " + money);
		System.out.println("===========================");
	}
}
